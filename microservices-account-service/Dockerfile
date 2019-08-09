FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 1111
ADD target/*.jar /account-service.jar
RUN bash -c 'touch /account-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/account-service.jar"]
