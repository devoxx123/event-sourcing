FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 3333
ADD target/*.jar /inventory-service.jar
RUN bash -c 'touch /inventory-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/inventory-service.jar"]