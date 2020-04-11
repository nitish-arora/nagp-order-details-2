FROM openjdk:8-jre-alpine

WORKDIR /app

COPY target/orderDetails-0.0.2.jar /app/

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "orderDetails-0.0.2.jar"]