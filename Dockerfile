FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
expose 6666
COPY target/Movies-1.1.jar movies.jar
ENTRYPOINT ["java","-jar","/movies.jar"]