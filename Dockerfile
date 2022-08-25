FROM openjdk:17
EXPOSE 9003
ADD target/spring-arraylist-student-docker.jar spring-arraylist-student-docker.jar
ENTRYPOINT ["java","-jar","/spring-arraylist-student-docker.jar"]