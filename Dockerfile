FROM java:8-jdk-alpine
ADD ./target/MovieBackEnd-0.0.1-SNAPSHOT.jar MovieBackEnd-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","MovieBackEnd-0.0.1-SNAPSHOT.jar"]  