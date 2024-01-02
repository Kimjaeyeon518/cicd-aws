#FROM ubuntu:latest
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY build/libs/cicd-aws-0.0.1-SNAPSHOT.jar /app
COPY docker-compose.yaml /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app/cicd-aws-0.0.1-SNAPSHOT.jar"]
