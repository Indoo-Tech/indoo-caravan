FROM openjdk:21-jdk-alpine

WORKDIR /caravan

COPY build/libs/caravan-0.0.1-SNAPSHOT.jar /caravan/caravan-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/caravan/caravan-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
