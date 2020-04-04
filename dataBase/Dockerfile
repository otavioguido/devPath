FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
RUN chmod +x ./mvnw
# download the dependency if needed or if the pom file is changed
RUN ./mvnw dependency:go-offline -B
COPY src src
ADD target/dataBase-0.0.1-SNAPSHOT.jar dataBase.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "dataBase.jar"]