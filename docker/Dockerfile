FROM adoptopenjdk/openjdk11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} template-app-0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/template-app-0.1.jar"]