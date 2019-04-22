FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/swagger-spring-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
