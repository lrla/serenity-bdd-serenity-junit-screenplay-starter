**Projeto de Estudo de Serenity BDD + Cucumber + Selenium.**

Antes de iniciar, certifique-se de ter configurado o gradle em sua máquina e adicionado nas variáveis de ambiente o caminho.
1. Baixar o gradle 8.7 (https://gradle.org/install/) e deixá-lo em C:\
2. Editar variáveis de ambiente > Path, adicionar o caminho: C:\Gradle\gradle-8.7\bin
   
- Para executar os testes utilize o comando:

**gradle clean test --scan**

- Para dúvidas referentes a arquitetura acesse:

https://serenity-bdd.github.io/docs/tutorials/first_test

Recomendações:

- Utilizar o Intellij IDE
- Executar sempre os testes via terminal, com permissões de administrador.
- Manter sempre as versões de serenity-version iguais no **build.gradle**
- Alguns erros podem ocorrer devido a versão do JDK, optei por utilizar o JDK 11.
