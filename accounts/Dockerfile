#start with a base image of openjdk
FROM openjdk:17-jdk-slim

MAINTAINER "Nandivardhan Reddy"

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]
