package org.jerkar.addin.springboot;

import org.jerkar.api.depmanagement.JkDependencyExclusions;
import org.jerkar.api.depmanagement.JkVersionProvider;

class Version1_2_8 extends JkSpringbootVersionManagement {
    
    @Override
    public JkVersionProvider versionProvider() {
        return JkVersionProvider.of()
            .and("antlr:antlr", "2.7.7")
            .and("ch.qos.logback:logback-classic", "1.1.3")
            .and("com.atomikos:transactions-jdbc", "3.9.3")
            .and("com.atomikos:transactions-jms", "3.9.3")
            .and("com.atomikos:transactions-jta", "3.9.3")
            .and("com.fasterxml.jackson.core:jackson-annotations", "2.4.6")
            .and("com.fasterxml.jackson.core:jackson-core", "2.4.6")
            .and("com.fasterxml.jackson.core:jackson-databind", "2.4.6")
            .and("com.fasterxml.jackson.dataformat:jackson-dataformat-xml", "2.4.6")
            .and("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml", "2.4.6")
            .and("com.fasterxml.jackson.datatype:jackson-datatype-jdk8", "2.4.6")
            .and("com.fasterxml.jackson.datatype:jackson-datatype-joda", "2.4.6")
            .and("com.fasterxml.jackson.datatype:jackson-datatype-jsr310", "2.4.6")
            .and("com.gemstone.gemfire:gemfire", "7.0.2")
            .and("com.github.mxab.thymeleaf.extras:thymeleaf-extras-data-attribute", "1.3")
            .and("com.google.code.gson:gson", "2.3.1")
            .and("com.googlecode.json-simple:json-simple", "1.1.1")
            .and("com.h2database:h2", "1.4.190")
            .and("com.jayway.jsonpath:json-path", "0.9.1")
            .and("com.samskivert:jmustache", "1.10")
            .and("com.sun.mail:javax.mail", "1.5.4")
            .and("com.zaxxer:HikariCP", "2.2.5")
            .and("com.zaxxer:HikariCP-java6", "2.2.5")
            .and("commons-beanutils:commons-beanutils", "1.9.2")
            .and("commons-collections:commons-collections", "3.2.2")
            .and("commons-dbcp:commons-dbcp", "1.4")
            .and("commons-digester:commons-digester", "2.1")
            .and("commons-pool:commons-pool", "1.6")
            .and("io.dropwizard.metrics:metrics-core", "3.1.2")
            .and("io.dropwizard.metrics:metrics-ganglia", "3.1.2")
            .and("io.dropwizard.metrics:metrics-graphite", "3.1.2")
            .and("io.dropwizard.metrics:metrics-servlets", "3.1.2")
            .and("io.undertow:undertow-core", "1.1.9.Final")
            .and("io.undertow:undertow-servlet", "1.1.9.Final")
            .and("io.undertow:undertow-websockets-jsr", "1.1.9.Final")
            .and("javax.cache:cache-api", "1.0.0")
            .and("javax.jms:jms-api", "1.1-rev-1")
            .and("javax.mail:javax.mail-api", "1.5.4")
            .and("javax.servlet:javax.servlet-api", "3.1.0")
            .and("javax.servlet:jstl", "1.2")
            .and("javax.transaction:javax.transaction-api", "1.2")
            .and("jaxen:jaxen", "1.1.6")
            .and("joda-time:joda-time", "2.5")
            .and("junit:junit", "4.12")
            .and("log4j:log4j", "1.2.17")
            .and("mysql:mysql-connector-java", "5.1.38")
            .and("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect", "1.2.9")
            .and("org.apache.activemq:activemq-broker", "5.10.2")
            .and("org.apache.activemq:activemq-client", "5.10.2")
            .and("org.apache.activemq:activemq-jms-pool", "5.10.2")
            .and("org.apache.activemq:activemq-pool", "5.10.2")
            .and("org.apache.commons:commons-dbcp2", "2.0.1")
            .and("org.apache.commons:commons-pool2", "2.2")
            .and("org.apache.derby:derby", "10.10.2.0")
            .and("org.apache.httpcomponents:httpasyncclient", "4.0.2")
            .and("org.apache.httpcomponents:httpclient", "4.3.6")
            .and("org.apache.httpcomponents:httpmime", "4.3.6")
            .and("org.apache.logging.log4j:log4j-api", "2.1")
            .and("org.apache.logging.log4j:log4j-core", "2.1")
            .and("org.apache.logging.log4j:log4j-slf4j-impl", "2.1")
            .and("org.apache.solr:solr-solrj", "4.7.2")
            .and("org.apache.tomcat:tomcat-jdbc", "8.0.30")
            .and("org.apache.tomcat:tomcat-jsp-api", "8.0.30")
            .and("org.apache.tomcat.embed:tomcat-embed-core", "8.0.30")
            .and("org.apache.tomcat.embed:tomcat-embed-el", "8.0.30")
            .and("org.apache.tomcat.embed:tomcat-embed-jasper", "8.0.30")
            .and("org.apache.tomcat.embed:tomcat-embed-logging-juli", "8.0.30")
            .and("org.apache.tomcat.embed:tomcat-embed-websocket", "8.0.30")
            .and("org.apache.velocity:velocity", "1.7")
            .and("org.apache.velocity:velocity-tools", "2.0")
            .and("org.aspectj:aspectjrt", "1.8.7")
            .and("org.aspectj:aspectjtools", "1.8.7")
            .and("org.aspectj:aspectjweaver", "1.8.7")
            .and("org.codehaus.btm:btm", "2.1.4")
            .and("org.codehaus.groovy:groovy", "2.4.4")
            .and("org.codehaus.groovy:groovy-all", "2.4.4")
            .and("org.codehaus.groovy:groovy-ant", "2.4.4")
            .and("org.codehaus.groovy:groovy-bsf", "2.4.4")
            .and("org.codehaus.groovy:groovy-console", "2.4.4")
            .and("org.codehaus.groovy:groovy-docgenerator", "2.4.4")
            .and("org.codehaus.groovy:groovy-groovydoc", "2.4.4")
            .and("org.codehaus.groovy:groovy-groovysh", "2.4.4")
            .and("org.codehaus.groovy:groovy-jmx", "2.4.4")
            .and("org.codehaus.groovy:groovy-json", "2.4.4")
            .and("org.codehaus.groovy:groovy-jsr223", "2.4.4")
            .and("org.codehaus.groovy:groovy-nio", "2.4.4")
            .and("org.codehaus.groovy:groovy-servlet", "2.4.4")
            .and("org.codehaus.groovy:groovy-sql", "2.4.4")
            .and("org.codehaus.groovy:groovy-swing", "2.4.4")
            .and("org.codehaus.groovy:groovy-templates", "2.4.4")
            .and("org.codehaus.groovy:groovy-test", "2.4.4")
            .and("org.codehaus.groovy:groovy-testng", "2.4.4")
            .and("org.codehaus.groovy:groovy-xml", "2.4.4")
            .and("org.codehaus.janino:janino", "2.6.1")
            .and("org.crashub:crash.cli", "1.3.2")
            .and("org.crashub:crash.connectors.ssh", "1.3.2")
            .and("org.crashub:crash.connectors.telnet", "1.3.2")
            .and("org.crashub:crash.embed.spring", "1.3.2")
            .and("org.crashub:crash.plugins.cron", "1.3.2")
            .and("org.crashub:crash.plugins.mail", "1.3.2")
            .and("org.crashub:crash.shell", "1.3.2")
            .and("org.eclipse.jetty:jetty-annotations", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-continuation", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-deploy", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-http", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-io", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-jmx", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-jsp", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-plus", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-security", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-server", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-servlet", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-servlets", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-util", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-webapp", "9.2.14.v20151106")
            .and("org.eclipse.jetty:jetty-xml", "9.2.14.v20151106")
            .and("org.eclipse.jetty.orbit:javax.servlet.jsp", "2.2.0.v201112011158")
            .and("org.eclipse.jetty.websocket:javax-websocket-server-impl", "9.2.14.v20151106")
            .and("org.eclipse.jetty.websocket:websocket-server", "9.2.14.v20151106")
            .and("org.flywaydb:flyway-core", "3.1")
            .and("org.freemarker:freemarker", "2.3.23")
            .and("org.glassfish:javax.el", "3.0.0")
            .and("org.glassfish.jersey.containers:jersey-container-servlet", "2.14")
            .and("org.glassfish.jersey.containers:jersey-container-servlet-core", "2.14")
            .and("org.glassfish.jersey.core:jersey-server", "2.14")
            .and("org.glassfish.jersey.ext:jersey-bean-validation", "2.14")
            .and("org.glassfish.jersey.ext:jersey-spring3", "2.14")
            .and("org.glassfish.jersey.media:jersey-media-json-jackson", "2.14")
            .and("org.hamcrest:hamcrest-core", "1.3")
            .and("org.hamcrest:hamcrest-library", "1.3")
            .and("org.hibernate:hibernate-ehcache", "4.3.11.Final")
            .and("org.hibernate:hibernate-entitymanager", "4.3.11.Final")
            .and("org.hibernate:hibernate-envers", "4.3.11.Final")
            .and("org.hibernate:hibernate-jpamodelgen", "4.3.11.Final")
            .and("org.hibernate:hibernate-validator", "5.1.3.Final")
            .and("org.hornetq:hornetq-jms-client", "2.4.7.Final")
            .and("org.hornetq:hornetq-jms-server", "2.4.7.Final")
            .and("org.hsqldb:hsqldb", "2.3.3")
            .and("org.javassist:javassist", "3.18.1-GA")
            .and("org.jdom:jdom2", "2.0.6")
            .and("org.jolokia:jolokia-core", "1.2.3")
            .and("org.liquibase:liquibase-core", "3.3.5")
            .and("org.mockito:mockito-core", "1.10.19")
            .and("org.mongodb:mongo-java-driver", "2.12.5")
            .and("org.projectreactor:reactor-core", "1.1.6.RELEASE")
            .and("org.projectreactor:reactor-groovy", "1.1.6.RELEASE")
            .and("org.projectreactor:reactor-groovy-extensions", "1.1.6.RELEASE")
            .and("org.projectreactor:reactor-logback", "1.1.6.RELEASE")
            .and("org.projectreactor:reactor-net", "1.1.6.RELEASE")
            .and("org.projectreactor.spring:reactor-spring-context", "1.1.3.RELEASE")
            .and("org.projectreactor.spring:reactor-spring-core", "1.1.3.RELEASE")
            .and("org.projectreactor.spring:reactor-spring-messaging", "1.1.3.RELEASE")
            .and("org.projectreactor.spring:reactor-spring-webmvc", "1.1.3.RELEASE")
            .and("org.slf4j:jcl-over-slf4j", "1.7.13")
            .and("org.slf4j:jul-to-slf4j", "1.7.13")
            .and("org.slf4j:log4j-over-slf4j", "1.7.13")
            .and("org.slf4j:slf4j-api", "1.7.13")
            .and("org.slf4j:slf4j-jdk14", "1.7.13")
            .and("org.slf4j:slf4j-log4j12", "1.7.13")
            .and("org.spockframework:spock-core", "0.7-groovy-2.0")
            .and("org.spockframework:spock-spring", "0.7-groovy-2.0")
            .and("org.springframework:spring-aop", "4.1.9.RELEASE")
            .and("org.springframework:spring-aspects", "4.1.9.RELEASE")
            .and("org.springframework:spring-beans", "4.1.9.RELEASE")
            .and("org.springframework:spring-context", "4.1.9.RELEASE")
            .and("org.springframework:spring-context-support", "4.1.9.RELEASE")
            .and("org.springframework:spring-core", "4.1.9.RELEASE")
            .and("org.springframework:spring-expression", "4.1.9.RELEASE")
            .and("org.springframework:spring-instrument", "4.1.9.RELEASE")
            .and("org.springframework:spring-instrument-tomcat", "4.1.9.RELEASE")
            .and("org.springframework:spring-jdbc", "4.1.9.RELEASE")
            .and("org.springframework:spring-jms", "4.1.9.RELEASE")
            .and("org.springframework:spring-messaging", "4.1.9.RELEASE")
            .and("org.springframework:spring-orm", "4.1.9.RELEASE")
            .and("org.springframework:spring-oxm", "4.1.9.RELEASE")
            .and("org.springframework:spring-test", "4.1.9.RELEASE")
            .and("org.springframework:spring-tx", "4.1.9.RELEASE")
            .and("org.springframework:spring-web", "4.1.9.RELEASE")
            .and("org.springframework:spring-webmvc", "4.1.9.RELEASE")
            .and("org.springframework:spring-webmvc-portlet", "4.1.9.RELEASE")
            .and("org.springframework:spring-websocket", "4.1.9.RELEASE")
            .and("org.springframework:springloaded", "1.2.5.RELEASE")
            .and("org.springframework.amqp:spring-amqp", "1.4.6.RELEASE")
            .and("org.springframework.amqp:spring-erlang", "1.4.6.RELEASE")
            .and("org.springframework.amqp:spring-rabbit", "1.4.6.RELEASE")
            .and("org.springframework.batch:spring-batch-core", "3.0.6.RELEASE")
            .and("org.springframework.batch:spring-batch-infrastructure", "3.0.6.RELEASE")
            .and("org.springframework.batch:spring-batch-integration", "3.0.6.RELEASE")
            .and("org.springframework.batch:spring-batch-test", "3.0.6.RELEASE")
            .and("org.springframework.boot:spring-boot", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-actuator", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-autoconfigure", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-configuration-processor", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-dependency-tools", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-loader", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-loader-tools", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-actuator", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-amqp", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-aop", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-batch", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-cloud-connectors", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-elasticsearch", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-gemfire", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-jpa", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-mongodb", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-rest", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-data-solr", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-freemarker", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-groovy-templates", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-hateoas", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-hornetq", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-integration", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-jdbc", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-jersey", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-jetty", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-jta-atomikos", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-jta-bitronix", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-log4j", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-log4j2", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-logging", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-mail", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-mobile", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-mustache", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-redis", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-remote-shell", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-security", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-social-facebook", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-social-linkedin", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-social-twitter", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-test", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-thymeleaf", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-tomcat", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-undertow", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-velocity", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-web", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-websocket", "1.2.8.RELEASE")
            .and("org.springframework.boot:spring-boot-starter-ws", "1.2.8.RELEASE")
            .and("org.springframework.cloud:spring-cloud-cloudfoundry-connector", "1.1.1.RELEASE")
            .and("org.springframework.cloud:spring-cloud-core", "1.1.1.RELEASE")
            .and("org.springframework.cloud:spring-cloud-heroku-connector", "1.1.1.RELEASE")
            .and("org.springframework.cloud:spring-cloud-localconfig-connector", "1.1.1.RELEASE")
            .and("org.springframework.cloud:spring-cloud-spring-service-connector", "1.1.1.RELEASE")
            .and("org.springframework.data:spring-cql", "1.1.4.RELEASE")
            .and("org.springframework.data:spring-data-cassandra", "1.1.4.RELEASE")
            .and("org.springframework.data:spring-data-commons", "1.9.4.RELEASE")
            .and("org.springframework.data:spring-data-couchbase", "1.2.4.RELEASE")
            .and("org.springframework.data:spring-data-elasticsearch", "1.1.4.RELEASE")
            .and("org.springframework.data:spring-data-gemfire", "1.5.4.RELEASE")
            .and("org.springframework.data:spring-data-jpa", "1.7.4.RELEASE")
            .and("org.springframework.data:spring-data-mongodb", "1.6.4.RELEASE")
            .and("org.springframework.data:spring-data-mongodb-cross-store", "1.6.4.RELEASE")
            .and("org.springframework.data:spring-data-mongodb-log4j", "1.6.4.RELEASE")
            .and("org.springframework.data:spring-data-neo4j", "3.2.4.RELEASE")
            .and("org.springframework.data:spring-data-redis", "1.4.4.RELEASE")
            .and("org.springframework.data:spring-data-rest-core", "2.2.4.RELEASE")
            .and("org.springframework.data:spring-data-rest-webmvc", "2.2.4.RELEASE")
            .and("org.springframework.data:spring-data-solr", "1.3.4.RELEASE")
            .and("org.springframework.hateoas:spring-hateoas", "0.16.0.RELEASE")
            .and("org.springframework.integration:spring-integration-amqp", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-core", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-event", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-feed", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-file", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-ftp", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-gemfire", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-groovy", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-http", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-ip", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-jdbc", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-jms", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-jmx", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-jpa", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-mail", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-mongodb", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-mqtt", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-redis", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-rmi", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-scripting", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-security", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-sftp", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-stream", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-syslog", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-test", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-twitter", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-websocket", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-ws", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-xml", "4.1.8.RELEASE")
            .and("org.springframework.integration:spring-integration-xmpp", "4.1.8.RELEASE")
            .and("org.springframework.mobile:spring-mobile-device", "1.1.5.RELEASE")
            .and("org.springframework.plugin:spring-plugin-core", "1.1.0.RELEASE")
            .and("org.springframework.security:spring-security-acl", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-aspects", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-cas", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-config", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-core", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-crypto", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-jwt", "1.0.3.RELEASE")
            .and("org.springframework.security:spring-security-ldap", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-openid", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-remoting", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-taglibs", "3.2.9.RELEASE")
            .and("org.springframework.security:spring-security-web", "3.2.9.RELEASE")
            .and("org.springframework.social:spring-social-config", "1.1.4.RELEASE")
            .and("org.springframework.social:spring-social-core", "1.1.4.RELEASE")
            .and("org.springframework.social:spring-social-facebook", "2.0.3.RELEASE")
            .and("org.springframework.social:spring-social-facebook-web", "2.0.3.RELEASE")
            .and("org.springframework.social:spring-social-linkedin", "1.0.2.RELEASE")
            .and("org.springframework.social:spring-social-security", "1.1.4.RELEASE")
            .and("org.springframework.social:spring-social-twitter", "1.1.2.RELEASE")
            .and("org.springframework.social:spring-social-web", "1.1.4.RELEASE")
            .and("org.springframework.ws:spring-ws-core", "2.2.3.RELEASE")
            .and("org.springframework.ws:spring-ws-security", "2.2.3.RELEASE")
            .and("org.springframework.ws:spring-ws-support", "2.2.3.RELEASE")
            .and("org.springframework.ws:spring-ws-test", "2.2.3.RELEASE")
            .and("org.thymeleaf:thymeleaf", "2.1.4.RELEASE")
            .and("org.thymeleaf:thymeleaf-spring4", "2.1.4.RELEASE")
            .and("org.thymeleaf.extras:thymeleaf-extras-conditionalcomments", "2.1.1.RELEASE")
            .and("org.thymeleaf.extras:thymeleaf-extras-springsecurity3", "2.1.2.RELEASE")
            .and("org.yaml:snakeyaml", "1.14")
            .and("redis.clients:jedis", "2.5.2")
            .and("wsdl4j:wsdl4j", "1.6.3");
    }
    @Override
    public JkDependencyExclusions dependencyExclusions() {
        return JkDependencyExclusions.builder()
            .on("commons-beanutils:commons-beanutils", "commons-logging:commons-logging")
            .on("commons-digester:commons-digester", "commons-logging:commons-logging")
            .on("org.apache.httpcomponents:httpasyncclient", "commons-logging:commons-logging")
            .on("org.apache.httpcomponents:httpclient", "commons-logging:commons-logging")
            .on("org.apache.velocity:velocity-tools", "commons-logging:commons-logging")
            .on("org.crashub:crash.connectors.ssh", "commons-logging:commons-logging")
            .on("org.eclipse.jetty:jetty-jsp", "org.eclipse.jetty.orbit:javax.servlet")
            .on("org.hornetq:hornetq-jms-server", "org.jboss.spec.javax.transaction:jboss-transaction-api_1.1_spec")
            .on("org.spockframework:spock-core", "org.codehaus.groovy:groovy-all")
            .on("org.springframework:spring-core", "commons-logging:commons-logging")
            .on("org.springframework.boot:spring-boot-starter", "commons-logging:commons-logging")
            .on("org.springframework.boot:spring-boot-starter-test", "commons-logging:commons-logging")
            .on("org.springframework.cloud:spring-cloud-spring-service-connector", "log4j:log4j")
            .on("org.springframework.integration:spring-integration-http", "commons-logging:commons-logging", "commons-logging:commons-logging-api")
            .on("org.springframework.ws:spring-ws-core", "commons-logging:commons-logging")
            .on("org.springframework.ws:spring-ws-security", "commons-logging:commons-logging")
            .on("org.springframework.ws:spring-ws-support", "commons-logging:commons-logging")
            .on("org.springframework.ws:spring-ws-test", "commons-logging:commons-logging").build();
    }

}
