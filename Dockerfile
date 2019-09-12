FROM openjdk:8
ADD target/docker-with-spring-boot-app.jar docker-with-spring-boot-app.jar
EXPOSE 8085
ENTRYPOINT [ "java" ,"-jar" ,"docker-with-spring-boot-app.jar" ]
