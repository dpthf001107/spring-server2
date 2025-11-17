# Build stage
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Install Gradle wrapper dependencies
COPY gradlew .
COPY gradle ./gradle
RUN chmod +x ./gradlew

# Copy build files
COPY build.gradle settings.gradle* ./
COPY server/discovery/build.gradle ./server/discovery/
COPY server/discovery/src ./server/discovery/src

# Build the application
RUN ./gradlew :server:discovery:clean :server:discovery:build -x test --no-daemon

# Runtime stage
FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY --from=build /app/server/discovery/build/libs/*.jar discovery-server.jar

ENTRYPOINT ["java", "-jar", "/discovery-server.jar"]
