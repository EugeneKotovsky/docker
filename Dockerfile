FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
COPY target/spring_boot_rest-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]