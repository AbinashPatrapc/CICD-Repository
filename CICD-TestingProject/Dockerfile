#FROM openjdk:11-jdk

#ADD target/cicd-testingproject-1.jar cicd-testingproject-1.jar

#EXPOSE 9898

#ENTRYPOINT ["java", "-jar", "/cicd-testingproject-1.jar"]


FROM openjdk:11-jdk

WORKDIR /app/cicd-testingproject

COPY /harness/CICD-TestingProject/target/cicd-testingproject-1.jar cicd-testingproject-1.jar

EXPOSE 9898

ENTRYPOINT ["java", "-jar", "cicd-testingproject-1.jar"]