FROM openjdk:8
EXPOSE 8081
#ADD target/docker-jenkin-integration-sample.jar docker-jenkin-integration-sample.jar
ARG JAR_FILE
COPY ${JAR_FILE} docker-azure-demo.jar
ENTRYPOINT ["java","-jar","/docker-azure-demo.jar"]