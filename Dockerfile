FROM eclipse-temurin:17
COPY target/hiweb.jar hiweb.jar
CMD ["java","-jar","hiweb.jar"]