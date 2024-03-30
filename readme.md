# Conversor de Chaves para Snake Case 🐍

Este é um projeto simples de uma API em Java com Spring Boot que converte as chaves de um mapa (Map) de Camel Case para Snake Case. A API recebe um mapa como entrada e retorna um novo mapa com as chaves convertidas para Snake Case.

## Funcionalidades 🛠️

- Converte as chaves de um mapa de Camel Case para Snake Case.
- Suporta conversão de chaves aninhadas e valores do tipo lista.

## Como Utilizar 🚀

1. Clone este repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Navegue até o diretório do projeto: `cd seu-repositorio`
3. Compile os arquivos Java: `mvn clean install`
4. Execute o programa: `java -jar target/demo-0.0.1-SNAPSHOT.jar`
5. Faça uma requisição POST para `http://localhost:8080/api/convert` com um corpo de requisição contendo um mapa em formato JSON com as chaves em Camel Case.
6. Exemplo de corpo de requisição:
```
  {
    "firstName": "John",
    "lastName": "Doe",
    "address": {
      "streetName": "123 Street",
      "cityName": "City"
    },
    "phoneNumbers": [
      "123456789",
      "987654321"
    ]
  }
```

## Tecnologias Utilizadas 💻

- Java
- Spring Boot
- Maven

## Contribuição 🤝

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para relatar problemas, sugerir novas funcionalidades ou enviar pull requests com melhorias.

## Licença 📝

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais detalhes.
