# Usando a imagem do OpenJDK
FROM openjdk:17-jdk-slim

# Diretório de trabalho no container
WORKDIR /app

# Copiando o arquivo .jar para dentro do container
COPY target/autopecas-0.0.1-SNAPSHOT.jar /app/app.jar

# Expondo a porta para o Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]


