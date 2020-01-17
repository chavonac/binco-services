FROM openjdk:8
VOLUME /tmp
EXPOSE 8085
ADD ./target/binco-services-0.0.1-SNAPSHOT.jar binco-service
ENTRYPOINT ["java", "-jar", "/binco-service"]