# Build stage
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Install Gradle wrapper dependencies
COPY gradlew .
COPY gradle ./gradle
RUN chmod +x ./gradlew

# Copy build files
COPY build.gradle settings.gradle* ./
COPY service/soccer/build.gradle ./service/soccer/
COPY service/soccer/src ./service/soccer/src

# Build the application
RUN ./gradlew :service:soccer:clean :service:soccer:build -x test --no-daemon

# Runtime stage
FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

RUN apk update && apk add --no-cache curl

COPY --from=build /app/service/soccer/build/libs/*.jar soccer-service.jar

ENTRYPOINT ["java", "-jar", "/soccer-service.jar"]

