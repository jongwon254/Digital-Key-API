FROM openjdk:17-alpine

EXPOSE 8080

ADD target/digital-key.jar digital-key.jar

ENTRYPOINT ["java", "-jar", "/digital-key.jar"]