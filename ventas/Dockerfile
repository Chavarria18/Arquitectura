#
#SHELL ["/bin/bash", "maven package"] 
#FROM maven:3.6-jdk-11 as maven_build
#WORKDIR /ventas
#COPY pom.xml .
#COPY src ./src
#RUN mvn  package

#FROM maven:3.6.0-jdk-11-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml  package

FROM openjdk:8
ADD target/ventas-0.0.1-SNAPSHOT.jar ventas-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","ventas-0.0.1-SNAPSHOT.jar" ]