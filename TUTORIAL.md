# Guia do Usuário - Projeto Gerenciamento de Pedidos com Spring Boot

## Visão Geral

Este projeto é uma aplicação web construída em Java com Spring Boot, demonstrando a integração de várias funcionalidades, como mapeamento de entidades JPA, controle de rotas REST e operações CRUD com um banco de dados. O projeto foi desenvolvido com o intuito de fornecer um exemplo prático de como construir uma aplicação completa, apresentando desde a configuração inicial até a implementação de operações básicas de gerenciamento de dados.

## Público-Alvo

Este guia destina-se principalmente aos desenvolvedores que desejam criar aplicativos web utilizando Spring Boot para construir aplicações robustas e escaláveis. Pode ser útil também aos administradores de sistema responsáveis pela implantação e manutenção da aplicação em um ambiente de produção.

## Compatibilidade e Requisitos do Sistema

- **Sistemas Operacionais Compatíveis**: Windows, macOS, Linux
- **Requisitos de Hardware**: Processador dual-core, 4GB de RAM (mínimo)

## Pré-requisitos

### Softwares Necessários

- **JDK**: Versão 11
- **Maven**: Versão 3.6 ou superior
- **Postman**: Para testar as APIs

### Ambiente de Desenvolvimento

- **IDE**: IntelliJ IDEA (ou qualquer IDE compatível com Java)
- **Plugins Úteis**: Lombok, Spring Boot DevTools

### Dependências

- **Spring Boot**: Starter Web, Starter Data JPA, Starter Test
- **Banco de Dados**: H2 (runtime), PostgreSQL (runtime)

## Instalação

### Clonagem do Repositório

Para obter uma cópia local do projeto, será necessário clonar o repositório do GitHub. Para isto, siga os passos abaixo:

1. Acesse o repositório do projeto no GitHub: [Projeto Spring Boot](https://github.com/Bruna-Leticia12/Projeto_Spring_Boot).
2. Clique no botão **Code** localizado à direita, no topo da lista de arquivos.
3. No menu suspenso, certifique-se de que a opção **HTTPS** esteja selecionada.
4. Copie a URL do repositório clicando em "Copy url to clipboard", conforme a imagem abaixo:
   
[![imagem-Git-Clonar.jpg](https://i.postimg.cc/nckzRFTn/imagem-Git-Clonar.jpg)](https://postimg.cc/JGsMtW9F)

5. Em seguida, abra um terminal (Git Bash, PowerShell, terminal nativo de seu sistema operacional ou qualquer outro de sua preferência).
6. Navegue até o diretório onde deseja clonar o repositório usando o comando `cd`:
   
[![imagem1-CD.jpg](https://i.postimg.cc/3Ns7bqV5/imagem1-CD.jpg)](https://postimg.cc/bS9KZmq3)

7. Execute o seguinte comando para clonar o repositório:
   
[![Imagem2-Git.jpg](https://i.postimg.cc/fb3rLvbk/Imagem2-Git.jpg)](https://postimg.cc/wtpV4LLd)

8. Após o término do processo, você pode acessar o diretório do projeto usando:
   
[![Imagem3-Cd.jpg](https://i.postimg.cc/5tLKM20R/Imagem3-Cd.jpg)](https://postimg.cc/t1RN3yF3)

### Instalação de Dependências

Após clonar o repositório, será necessário instalar as dependências do projeto. Siga estas etapas:

1. Abra um terminal (Git Bash, PowerShell, terminal nativo de seu sistema operacional ou qualquer outro de sua preferência).
2. Navegue até o diretório raiz do projeto onde está localizado o arquivo `pom.xml`.
3. Execute o seguinte comando Maven para instalar as dependências:
   
[![Imagem4-Mvn.jpg](https://i.postimg.cc/wxrNh8gW/Imagem4-Mvn.jpg)](https://postimg.cc/6TdTXP7R)

### Compilação e Execução

Para compilar e executar o projeto, siga estas etapas:

**1. Compilação:**

- Abra um terminal (Git Bash, PowerShell, terminal nativo de seu sistema operacional ou qualquer outro de sua preferência).
- Navegue até o diretório raiz do projeto.
- Execute o seguinte comando Maven para compilar o projeto:

[![Imagem5-Mvn.jpg](https://i.postimg.cc/wM6M523Q/Imagem5-Mvn.jpg)](https://postimg.cc/62mBtdr8)

**2. Execução:**

- *Via Maven*:
    - Abra um terminal (Git Bash, PowerShell, terminal nativo de seu sistema operacional ou qualquer outro de sua preferência).
    - Navegue até o diretório raiz do projeto.
    - Execute o seguinte comando Maven para executar o projeto:
    
[![Imagem6-Run.jpg](https://i.postimg.cc/j2wfnv13/Imagem6-Run.jpg)](https://postimg.cc/vxyTp7b5)

- *Via IDE (IntelliJ IDEA)*:
    - Abra o projeto na sua IDE.
    - Encontre a classe principal `SpringbootprojetoApplication` e execute-a.

## Configuração

### Arquivos de Configuração

- **`application.dev.properties`**: Configurações principais do Spring Boot. Este arquivo inclui detalhes do banco de dados e outras configurações específicas que substituem ou complementam as configurações no `application.properties` quando o perfil ativo é `dev`:
  
[![dev-Properties.jpg](https://i.postimg.cc/BbhGR9Bt/dev-Properties.jpg)](https://postimg.cc/K3gVgWVy)

- **`pom.xml`**: Definições de dependências e plugins do Maven:
  
[![Imagem7-Pom.jpg](https://i.postimg.cc/vmCmPGgZ/Imagem7-Pom.jpg)](https://postimg.cc/7CMDh8nF)[![Imagem8-Pom.jpg](https://i.postimg.cc/L5L1pNgL/Imagem8-Pom.jpg)](https://postimg.cc/xNjCGGR1)[![Imagem9-Pom.jpg](https://i.postimg.cc/T3pT5hQH/Imagem9-Pom.jpg)](https://postimg.cc/bZc7Ky7Q)

### Variáveis de Ambiente

- **JAVA_HOME**: Caminho para o JDK 11
- **MAVEN_HOME**: Caminho para o Maven

### Parâmetros de Execução

- Não há parâmetros específicos necessários para este projeto.

## Funcionalidades e Uso

### Recursos do Projeto

- CRUD (Create, Read, Update, Delete) para Usuários, Produtos, Categorias e Pedidos.
- Mapeamento de relacionamentos JPA.
- Endpoints REST para cada entidade.

### Exemplos de Uso

Este projeto foi desenvolvido para o gerenciamento de pedidos, utilizando o framework _Spring Boot_ para automatizar e, consequentemente, facilitar diversas operações. Os principais exemplos de uso incluem:

1. **Gerenciamento de Usuários**: Adicionar, atualizar, deletar e listar usuários.
2. **Gerenciamento de Produtos**: Adicionar, atualizar, deletar e listar produtos.
3. **Gerenciamento de Categorias**: Adicionar, atualizar, deletar e listar categorias.
4. **Gerenciamento de Pedidos**: Adicionar, atualizar, deletar e listar pedidos.

## Testes

Foram realizados Testes para que o programa chegasse até a sua versão atual.

### User
[![user-1.jpg](https://i.postimg.cc/TwBsx38b/user-1.jpg)](https://postimg.cc/Ppzyzh5f)

[![User-2.jpg](https://i.postimg.cc/BnNw6g94/User-2.jpg)](https://postimg.cc/XrGg19Yz)

### Product
[![Product-1.jpg](https://i.postimg.cc/nz9d3fsh/Product-1.jpg)](https://postimg.cc/sQy9289k)

[![Product-2.jpg](https://i.postimg.cc/rs6fbZWC/Product-2.jpg)](https://postimg.cc/r0JGRJfK)

### Order
[![order-1.jpg](https://i.postimg.cc/Wbv9wKss/order-1.jpg)](https://postimg.cc/5jsqxsHr)

[![order-2.jpg](https://i.postimg.cc/L84Nr1q7/order-2.jpg)](https://postimg.cc/sv8YW149)

### Category
[![Category-1.jpg](https://i.postimg.cc/7Ld9GtB8/Category-1.jpg)](https://postimg.cc/94PZsb5J)

[![Category-2.jpg](https://i.postimg.cc/FRSZjbqf/Category-2.jpg)](https://postimg.cc/qhkyrKp0)

Foram realizados Testes para que o programa chegasse até a sua versão atual.

## Solução de Problemas

Durante a instalação ou execução do programa, é possível que ocorram alguns problemas. Os mais comuns incluem:

- _Versão Incompativel_

Dependendo da versão do Java que for executada, há um risco de o programa não funcionar corretamente. Esse problema pode ser facilmente solucionado com a utilização de versões anteriores, como o JDK 8. Isso ajuda a mitigar possíveis problemas de compatibilidade relacionados à versão do Java.

- _Ausência da ferramenta Maven_

A falta de uma ferramenta de automação de compilação, como o Maven, pode resultar no mau funcionamento do programa. Certifique-se de que este recurso esteja instalado corretamente."

> **Atenção!** Verifique se a versão do Maven é compatível com o programa.

## Contribuição

Este projeto está aberto para contribuições de desenvolvedores interessados em aprimorar suas funcionalidades. As seguintes contribuições são bem vindas:

* Identificação de  bugs;
* Sugerir melhorias;
* Contribuir com o código;
* Fornecer feedback regular;
* Promover o programa;

## Licença e Autorias

Este projeto é protegido pela **Licença MIT**, que garante aos usuários a liberdade de usar, modificar e distribuir o software conforme desejarem, desde que incluam um aviso de direitos autorais e a devida permissão no software distribuído.

## Autores:

- **Bruna Leticia dos Santos**
- **Caio Martins Taparo**
- **Gianlucca Rissato**
- **Nathalie Assis Gomes**
- **Vinicius de Souza Santos**