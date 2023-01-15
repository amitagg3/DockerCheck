FROM openjdk:8
EXPOSE 8080
ADD target/docker-check.jar docker-check.jar
ENTRYPOINT ["java","-jar","/docker-check.jar"]


