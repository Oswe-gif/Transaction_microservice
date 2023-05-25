FROM openjdk
COPY ./Transaccional/build/libs/Transaccional-0.0.1-SNAPSHOT.jar example.jar
CMD sleep 5 && java -jar example.jar