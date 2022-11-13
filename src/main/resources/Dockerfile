FROM openjdk:8-jdk-alpine
ADD firstproject-0.0.1-SNAPSHOT.jar handanmap.jar

ENV JAVA_OPTS="-Xmx200m"

EXPOSE 8080

CMD ["sh", "-c", "java $JAVA_OPTS -jar /handanmap.jar"]