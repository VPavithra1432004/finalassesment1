FROM openjdk:21
COPY ./target/assesment-12.jar assesment-12.jar
CMD ["java","-jar","assesment-12.jar"]