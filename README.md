# 📁 Estrutura do Projeto

```
cadastro-cardapio-hk/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/cadastro_cardapio_hk/
│   │   │   ├── controller/               # Controladores REST (endpoints da API)
│   │   │   │   ├── PratoController.java
│   │   │   │   └── Welcome.java
│   │   │   │
│   │   │   ├── exception/                # Tratamento de exceções e erros personalizados
│   │   │   │   ├── GlobalExceptionHandler.java
│   │   │   │   └── NomePratoJaExistenteException.java
│   │   │   │
│   │   │   ├── model/                    # Entidades e enums da aplicação
│   │   │   │   ├── Categoria.java
│   │   │   │   ├── Disponibilidade.java
│   │   │   │   └── Prato.java
│   │   │   │
│   │   │   ├── repository/               # Repositórios JPA
│   │   │   │   └── PratoRepository.java
│   │   │   │
│   │   │   ├── service/                  # Camada de serviço e regras de negócio
│   │   │   │   └── PratoService.java
│   │   │   │
│   │   │   └── CadastroCardapioHkApplication.java # Classe principal da aplicação
│   │   │
│   │   └── resources/
│   │       └── application.properties    # Configurações do Spring Boot
│
├── Dockerfile                            # Configuração do container Docker
├── pom.xml                               # Configuração de dependências Maven
└── README.md                             
```
