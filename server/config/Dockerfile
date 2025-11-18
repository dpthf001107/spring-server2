FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
RUN apk update && apk add --no-cache curl
COPY ./server/config/build/libs/*.jar config-server.jar
ENTRYPOINT ["java", "-jar", "/config-server.jar"]

