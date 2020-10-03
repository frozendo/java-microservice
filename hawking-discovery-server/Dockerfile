FROM openjdk:14-alpine

ADD ./build/libs/*.jar /hawking-discovery-server.jar

EXPOSE 8761

ENTRYPOINT java -jar hawking-discovery-server.jar