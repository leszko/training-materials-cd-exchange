FROM frolvlad/alpine-oraclejdk8:slim
ADD build/libs/exchange-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]