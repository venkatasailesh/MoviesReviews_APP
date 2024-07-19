FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/Movies-1.1.jar movies.jar
ENTRYPOINT ["java","-jar","/movies.jar"]