FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 9999
ADD target/*.jar /edge-service.jar
RUN bash -c 'touch /edge-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/edge-service.jar"]