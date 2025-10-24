# Desafio Técnico de Automação de Testes - Nathália Schramm

Este projeto contém um teste de interface web automatizado para a funcionalidade de login do painel administrativo da plataforma Desafio Tester Ueek.

## Ferramentas Utilizadas

* **Linguagem:** Java
* **Framework de Teste:** JUnit 5
* **Automação de Navegador:** Selenium WebDriver
* **Gerenciador de Dependências:** Maven

## Caso de Teste Automatizado

* **CT-003.001: Validar login de administrador com credenciais válidas**
    * **Objetivo:** Verificar se o login é bem-sucedido ao usar credenciais corretas.
    * **Script:** `src/test/java/br/com/meus/testes/LoginAdminTest.java`

## Pré-requisitos para Execução

Para rodar este projeto, você precisará ter instalado:

1.  Java JDK (versão 11 ou superior)
2.  Apache Maven
3.  Google Chrome (versão 141 ou compatível com o WebDriver)

## Como Executar o Teste

1.  Clone ou baixe este repositório.
2.  Abra um terminal ou prompt de comando na raiz do projeto (na mesma pasta onde está o arquivo `pom.xml`).
3.  Execute o seguinte comando Maven:

    ```bash
    mvn clean test
    ```
4.  O Maven irá baixar as dependências, compilar o código e executar o teste. O resultado (SUCESSO ou FALHA) será exibido no terminal.