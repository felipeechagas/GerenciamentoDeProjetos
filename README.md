# Gerenciamento de Projetos e Tarefas

## Descrição

Esta é uma aplicação web desenvolvida para o gerenciamento de projetos e tarefas. A aplicação permite aos usuários visualizar, adicionar, editar e excluir projetos e tarefas associadas. A solução foi construída utilizando Java Server Faces (JSF) com RichFaces, Spring Framework, Hibernate e HQL.

## Tecnologias Utilizadas

- **Java**: Versão 8
- **JSF (JavaServer Faces)**: 2.3
- **RichFaces**: 4.5.17.Final
- **Spring Framework**: 5.3.0
- **Hibernate**: 5.4.0.Final
- **MySQL**: Banco de dados
- **Maven**: Gerenciamento de dependências e build
- **NetBeans**: IDE utilizada para o desenvolvimento

## Funcionalidades

1. **Cadastro de Projetos**
   - Adicionar novos projetos com título, descrição e data de início.
   
2. **Listagem de Projetos**
   - Exibir todos os projetos cadastrados com opções para visualizar, editar e excluir.

3. **Cadastro de Tarefas**
   - Adicionar novas tarefas a um projeto existente, com título, descrição, prioridade e estimativa em horas.

4. **Listagem de Tarefas**
   - Exibir todas as tarefas associadas a um projeto com opções para visualizar, editar e excluir.

## Estrutura do Projeto

- `src/main/java/com/mycompany/gerenciamentodeprojetos`
  - `controller`: Contém as classes responsáveis pelo controle de fluxo e interação com a camada de apresentação.
  - `dao`: Contém as classes de acesso a dados (Data Access Objects).
  - `model`: Contém as classes de modelo (entidades).
  
- `src/main/resources`
  - `META-INF/hibernate.cfg.xml`: Configuração do Hibernate.
  - `WEB-INF/faces-config.xml`: Configuração do JSF.
  - `WEB-INF/applicationContext.xml`: Configuração do Spring.
  - `WEB-INF/web.xml`: Configuração do contexto web.

- `pom.xml`: Arquivo de configuração do Maven para gerenciamento de dependências e build.

## Configuração

1. **Configuração do Banco de Dados**
   - Edite o arquivo `hibernate.cfg.xml` para ajustar as configurações de conexão com o seu banco de dados MySQL.

2. **Dependências**
   - Certifique-se de que todas as dependências estão corretas no arquivo `pom.xml`.

3. **Compilação e Execução**
   - Compile e construa o projeto utilizando Maven:
     ```bash
     mvn clean install
     ```
   - Implante o arquivo WAR gerado em um servidor de aplicação compatível com Java EE (por exemplo, Apache Tomcat).

## Rodando a Aplicação

1. Inicie o servidor de aplicação (e.g., Tomcat).
2. Acesse a aplicação no navegador através do endereço: http://localhost:8080/gerenciamentodeprojetos
