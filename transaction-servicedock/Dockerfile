FROM openjdk:8-jdk-alpine
WORKDIR /spring_boot
ADD ./target/transaction-servicedock-0.0.1-SNAPSHOT.jar /spring_boot
EXPOSE 8080
CMD ["java","-jar","-Dspring.profiles.active=container","transaction-servicedock-0.0.1-SNAPSHOT.jar"]
