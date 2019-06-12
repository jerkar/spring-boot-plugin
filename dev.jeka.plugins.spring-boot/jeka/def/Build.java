import dev.jeka.core.api.depmanagement.*;
import dev.jeka.core.api.java.JkJavaVersion;
import dev.jeka.core.api.java.project.JkJavaProject;
import dev.jeka.core.api.system.JkLocator;
import dev.jeka.core.api.tooling.JkGitWrapper;
import dev.jeka.core.tool.JkCommands;
import dev.jeka.core.tool.JkEnv;
import dev.jeka.core.tool.JkInit;
import dev.jeka.core.tool.builtins.java.JkPluginJava;

import static dev.jeka.core.api.depmanagement.JkJavaDepScopes.PROVIDED;

class Build extends JkCommands {

    final JkPluginJava javaPlugin = getPlugin(JkPluginJava.class);

    @JkEnv("OSSRH_USER")
    public String ossrhUser;

    @JkEnv("OSSRH_PWD")
    public String ossrhPwd;

    @Override
    protected void setup() {
        JkJavaProject project = javaPlugin.getProject();
        JkGitWrapper git = JkGitWrapper.of(getBaseDir());

        // Let Git drives project version numbering
        String projectVersion = git.getVersionWithTagOrSnapshot();
        project.setVersionedModule("dev.jeka.plugins:springboot", projectVersion);
        project.getCompileSpec().setSourceAndTargetVersion(JkJavaVersion.V8);

        // Make javadoc only for releases
        if (!JkVersion.of(projectVersion).isSnapshot()) {
            javaPlugin.pack.javadoc = true;
        }

        // Use same Jeka version both for building and compiling
        project.addDependencies(JkDependencySet.of().andFile(JkLocator.getJekaJarPath(), PROVIDED));

        // Setup to publish on Maven Central
        javaPlugin.getProject().getMaker().getTasksForPublishing()
                .setMavenPublicationInfo(mavenPublicationInfo())
                .setPublishRepos(JkRepoSet.ofOssrhSnapshotAndRelease(ossrhUser, ossrhPwd));
    }

    protected JkMavenPublicationInfo mavenPublicationInfo() {
        return JkMavenPublicationInfo
                .of("Jeka plugin for Spring Boot", "A Jeka plugin for Spring boot application",
                        "https://github.com/jerkar/spring-boot-plugin")
                .withScm("https://github.com/jerkar/spring-boot-addin.git")
                .andApache2License()
                .andGitHubDeveloper("djeang", "djeangdev@yahoo.fr");
    }

    public static void main(String[] args) {
        JkPluginJava javaPlugin = JkInit.instanceOf(Build.class, args).javaPlugin;
        javaPlugin.clean().pack();
    }

}