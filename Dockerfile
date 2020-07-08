FROM openjdk:8-jre
ENTRYPOINT ["/usr/local/openjdk-8/bin/java", "-jar", "tarefas.jar"]
ADD target/tarefas-0.0.1-SNAPSHOT.jar tarefas.jar