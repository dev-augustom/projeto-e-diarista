# Projeto E-Diarista - Java

Este projeto simula um sistema simples de cadastro e gerenciamento de diaristas utilizando Java. A aplicação permite adicionar, listar, buscar e excluir diaristas. Ele tem como base uma lista em memória, sem a utilização de banco de dados, e serve como um exercício para testar e consolidar conceitos de programação orientada a objetos e estrutura de repositórios.

## Funcionalidades

- **Listar Diaristas**: Exibe todos os diaristas cadastrados no sistema.
- **Adicionar Diarista**: Permite adicionar um novo diarista ao sistema, fornecendo informações como nome, telefone, CPF e endereço.
- **Buscar Diarista por ID**: Permite buscar uma diarista específica através do seu ID.
- **Excluir Diarista por ID**: Permite excluir uma diarista do sistema através do seu ID.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada no projeto.
- **Estrutura de Dados (List)**: Para armazenar as diaristas em memória.

## Como Executar o Projeto

1. **Clone o repositório**:
    ```
    git clone https://github.com/dev-augustom/projeto-e-diarista.git
    ```
2. **Compile e execute** o programa utilizando a sua IDE favorita ou via linha de comando. Caso esteja usando o terminal, navegue até a pasta do projeto e execute:
    ```
    javac -d bin src/ProjetoSemana2/*.java
    java -cp bin ProjetoSemana2.Main
    ```

3. **Interaja com o sistema**: O sistema irá exibir um menu onde você poderá escolher entre as opções de listar, adicionar, buscar e excluir diaristas.

## Estrutura do Projeto

projeto-e-diarista/ │ ├── src/ │ ├── ProjetoSemana2/ │ │ ├── Main.java │ │ ├── DiaristaRepository.java │ │ └── models/ │ │ └── Diarista.java │ ├── semana2/ │ │ └── classes/ │ │ └── Diarista.java │ └── Irepository.java │ ├── README.md └── .gitignore

1.Descrição geral do projeto: "Esta é a versão um do projeto, basicamente poo mais avançado, por enquato oferece 4 funcionalidades.

Tecnologias utilizadas: "Java".

Licença: "Codigo aberto".
