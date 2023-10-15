FROM arm64v8/openjdk:17
WORKDIR /opt
ENV PORT 8081
EXPOSE 8081
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar