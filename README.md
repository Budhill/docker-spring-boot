# docker-spring-boot
This is a simple SpringBoot Application that runs in Docker.

## Instructions
1. After mvn clean install, build Docker by running:
    ```$ docker build -f Dockerfile -t docker-spring-boot .```
2. Run image by:
    ```$ docker run -p 8085:8085 docker-spring-boot```
