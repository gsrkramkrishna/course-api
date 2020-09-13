FROM openjdk:8
ADD target/course-api-2.jar course-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "course-api.jar"]
