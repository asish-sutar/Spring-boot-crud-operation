FROM openjdk:11
EXPOSE 5050
ADD target/crud-service.jar crud-service.jar 
ENTRYPOINT [ "java","-jar","/crud-service.jar" ]