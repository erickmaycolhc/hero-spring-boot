FROM openjdk:17-jdk-alpine
ADD ./hero-0.0.1-SNAPSHOT.jar hero-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "hero-0.0.1-SNAPSHOT.jar"]