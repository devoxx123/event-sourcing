FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 2222
ADD target/*.jar /catalog-service.jar
RUN bash -c 'touch /catalog-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/catalog-service.jar"]
