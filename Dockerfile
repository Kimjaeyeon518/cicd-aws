#FROM ubuntu:latest
FROM eclipse-temurin:21-jre-alpine

COPY build/libs/cicd-aws-0.0.1-SNAPSHOT.jar aa.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/aa.jar"]
