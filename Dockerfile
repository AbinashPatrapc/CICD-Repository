FROM openjdk:11-jdk

WORKDIR /app/cicd-testingproject

COPY /CICD-TestingProject/target/cicd-testingproject-1.jar cicd-testingproject-1.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "cicd-testingproject-1.jar"]
