FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl notifier -am clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /workspace/notifier/target/*.jar notifier.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "notifier.jar"]