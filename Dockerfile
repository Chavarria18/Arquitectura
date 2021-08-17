#FROM ubuntu:20.04
#SHELL ["/bin/bash", "maven package"] 
#FROM maven:3.6-jdk-11 as maven_build
#WORKDIR /ventas
#COPY pom.xml .
#COPY src ./src
#RUN mvn  package


FROM openjdk:8
ADD target/ventas-0.0.1-SNAPSHOT.jar ventas-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","ventas-0.0.1-SNAPSHOT.jar" ]