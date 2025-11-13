FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY ./build/libs/*.jar environment-service.jar

ENTRYPOINT ["java", "-jar", "/environment-service.jar"]

