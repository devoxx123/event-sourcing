FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 7979
ADD target/*.jar /hystrix-dashboard.jar
RUN bash -c 'touch /hystrix-dashboard.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/hystrix-dashboard.jar"]