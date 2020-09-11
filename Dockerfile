FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar course-api.jar
ENTRYPOINT ["java","-jar","/course-api.jar"]
