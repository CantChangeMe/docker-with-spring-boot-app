# docker-with-spring-boot-app
This sample project is about how to create docket image and deploy it inside the docker container

Run following commands to get it running.
# Building and run docker image.
 1.docker build -f Dockerfile -t docker-with-spring-boot-app .
 This command will build an image
 2.docker run -p 8085:8085 docker-with-spring-boot-app
 This command will run image in docker container.

