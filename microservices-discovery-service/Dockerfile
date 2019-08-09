FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 8761
ADD target/*.jar /discovery-service.jar
RUN bash -c 'touch /discovery-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/discovery-service.jar"]