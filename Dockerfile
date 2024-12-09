FROM maven:3.8.5-openjdk-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/def-soc-backend-0.0.1-SNAPSHOT.jar /app/def-soc-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/def-soc-backend-0.0.1-SNAPSHOT.jar"]
