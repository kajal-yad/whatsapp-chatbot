# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy your JAR file
COPY target/chatbot-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]