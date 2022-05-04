FROM openjdk:8
EXPOSE 9099
ADD target/DockerIntegration.jar DockerIntegration.jar
ENTRYPOINT ["java","jar","/DockerIntegration.jar"]