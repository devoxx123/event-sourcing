FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 8181
ADD target/*.jar /user-service.jar
RUN bash -c 'touch /user-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/user-service.jar"]
