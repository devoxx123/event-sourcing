FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 8787
ADD target/*.jar /online-store-web.jar
RUN bash -c 'touch /online-store-web.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/online-store-web.jar"]