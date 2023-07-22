
##DSCommerce backend

[![GPL License](https://img.shields.io/badge/License-GPL-yellow.svg)](https://opensource.org/licenses/)

Projeto desenvolvido teve o objetivo de criar um API Rest e-commerce, utilizando os padrões de arquitetura em camadas, onde e possível cadastrar um cliente com nível de autorização, e esse cliente pode cadastrar produtos (caso seja administrador) e selecionar produtos para o carrinho para realizar a compra, e foi o tratamento de suas exceções personalizadas.


## Stack utilizada

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()

[![spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)]()

[![postgresql](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)]()

[![heroku](https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white)]()

## Rodando localmente

Criar e executar o projeto em seu ambiente de desenvolvimento local é muito fácil. Certifique-se de ter o Git e JDK17 instalados e siga as instruções abaixo.


Clone o projeto

```bash
  git clone https://github.com/joaomenesesbsb/DSCommerce-backend.git
```

Em sua IDE de preferência(utilizei Intellij), importe a pasta backend e faça o update das dependências do maven.

Ao executar o projeto, pode ser acessado um navegador da Web em http://localhost:8080/

Dados para login: maria@gmail.com (cliente) e alex@gmai.com (cliente e administrador).

senha: 123456


## Funcionalidades

- Cadastrar Produtos
- Atualizar Produtos
- Deletar Produtos
- Usuário com autenticação JWT
- Salva Ordem de Produtos no Postgresql
- Separar produtos por categoria


## Autores

- [@joaomenesesbsb](https://github.com/joaomenesesbsb)

