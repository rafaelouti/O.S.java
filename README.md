# Ordem de Serviço de Manutenção

Este é um projeto de exemplo de uma aplicação de ordem de serviço de manutenção usando Spring Boot.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.0
- Spring Data JPA
- H2 Database
- Maven

## Estrutura do Projeto


## Configuração do Banco de Dados

O projeto está configurado para usar o banco de dados H2 em memória. As configurações estão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Executando a Aplicação
No IntelliJ IDEA
Importe o projeto como um projeto Maven.
Verifique se o JDK está configurado corretamente.
Execute a classe OrdemServicoApplication.
No Terminal
Navegue até o diretório do projeto.
Compile e empacote o projeto:
mvn clean package

Execute o arquivo JAR gerado:
java -jar target/ordem-servico-0.0.1-SNAPSHOT.jar

Usando Maven
Navegue até o diretório do projeto.
Execute o projeto diretamente com Maven:
mvn spring-boot:run

Endpoints da API
Listar todas as ordens de serviço: GET /ordens
Criar uma nova ordem de serviço: POST /ordens
Deletar uma ordem de serviço: DELETE /ordens/{id}
Testando a API
Você pode usar ferramentas como Postman ou cURL para testar os endpoints da API.

Contribuição
Sinta-se à vontade para contribuir com este projeto. Faça um fork do repositório, crie uma branch para suas alterações e envie um pull request.

Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.


