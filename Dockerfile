FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /var/lib/docker/tmp/docker-builder849519981/../../../../../home/travis/.m2/repository/io/swagger/swagger-spring/1.0.0/swagger-spring-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
