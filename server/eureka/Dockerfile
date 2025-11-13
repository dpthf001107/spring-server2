FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY ./build/libs/*.jar eureka-server.jar

ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]

