#Build Stage
FROM gradle:jdk21 AS build
ENV APP_HOME=./app/
WORKDIR $APP_HOME
COPY . .
RUN gradle build

# Run Stage
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./build/libs/name.jar"]
