FROM openjdk:8
MAINTAINER Zwinny Developer
EXPOSE 5555
ADD target/*.jar /shopping-cart-service.jar
RUN bash -c 'touch /shopping-cart-service.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/shopping-cart-service.jar"]
