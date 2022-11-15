FROM registry.redhat.io/jboss-eap-7/eap74-openjdk11-openshift-rhel8:7.4.7-8
COPY target/java-api.war $JBOSS_HOME/standalone/deployments/java-api.war