FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY ./build/libs/*.jar common-service.jar

ENTRYPOINT ["java", "-jar", "/common-service.jar"]

