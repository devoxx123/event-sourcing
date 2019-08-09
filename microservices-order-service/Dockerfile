FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 4444
ADD target/*.jar /order-service.jar
RUN bash -c 'touch /order-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/order-service.jar"]