#FROM openjdk:17-jdk-alpine
#
#RUN mvn package
#
#COPY target/dockerized.postgrestsql 0.0.1-SNAPSHOT.jar java-app.jar/
#
#ENTRYPOINT ["java", "jar", "java-app.jar"]
FROM maven:3.9.3 AS maven

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package

#ENTRYPOINT ["tail", "-f", "/dev/null"]

FROM openjdk:17-alpine

ARG JAR_FILE="dockerized.posgrestsql-0.0.1-SNAPSHOT.jar"

WORKDIR /opt/app

# Copy the spring-boot-api-tutorial.jar from the maven stage to the /opt/app directory of the current stage.
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

RUN apk add --update fontconfig freetype

EXPOSE 8085

ENTRYPOINT ["java","-jar","dockerized.posgrestsql-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]