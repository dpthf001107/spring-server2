FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY ./service/user/build/libs/*.jar user-service.jar

ENTRYPOINT ["java", "-jar", "/user-service.jar"]

