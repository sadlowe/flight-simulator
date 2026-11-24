FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl flight-tracker -am clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /workspace/flight-tracker/target/*.jar flight-tracker.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "flight-tracker.jar"]
