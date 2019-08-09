FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 8888
ADD target/*.jar /config-service.jar
RUN bash -c 'touch /config-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/config-service.jar"]
