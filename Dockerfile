FROM eclipse-temurin:21-jre-alpine

COPY build/libs/cicd-aws-0.0.1-SNAPSHOT.jar aaaa.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "/aaaa.jar"]
