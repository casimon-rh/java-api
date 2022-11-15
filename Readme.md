# Java API

Simple Java EE API (jax-rs & ejb)

## Base Image

> registry.redhat.io/jboss-eap-7/eap74-openjdk11-openshift-rhel8:7.4.7-8

## How to run:

```bash
mvn clean package
podman build -t java-api -f docker/jboss.dockerfile --compress .
podman run --rm -it -p 8080:8080 java-api
```

## How to test:

```bash
curl localhost:8080/java-api/hello
# Hello, wold
```