FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl flight-simulator -am clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /workspace/flight-simulator/target/*.jar flight-simulator.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "flight-simulator.jar"]
