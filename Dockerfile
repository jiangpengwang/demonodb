FROM openjdk:8-jdk-alpine

ADD target/demo.jar app.jar

CMD ["--server.port=8088"]

EXPOSE 8088

ENTRYPOINT ["java","-jar","app.jar"]