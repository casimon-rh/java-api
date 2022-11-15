# Java API

Simple Java EE API (jax-rs & ejb)

## Techs

> registry.redhat.io/jboss-eap-7/eap74-openjdk11-openshift-rhel8:7.4.7-8
> Java 11

## Tree

```bash
.
├── .gitignore
├── .vscode
│   ├── extensions.json
│   └── settings.json
├── Readme.md
├── docker
│   └── jboss.dockerfile
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com
        │       └── redhat
        │           └── svcs
        │               ├── MyApplication.java
        │               ├── beans
        │               │   └── HelloBean.java
        │               └── services
        │                   └── Hello.java
        └── resources
            └── META-INF
                └── MANIFEST.MF
```

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