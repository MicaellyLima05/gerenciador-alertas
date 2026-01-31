# 🛡️ Gerenciador de Alertas – Java

## 📌 Descrição do Projeto

Este projeto consiste em um **Gerenciador de Alertas** desenvolvido em **Java**, com foco na aplicação de **lógica de programação** e **orientação a objetos**. A aplicação funciona via **terminal**, permitindo o cadastro, gerenciamento e consulta de alertas de segurança simulados, como SQL Injection, XSS e Brute Force.

O objetivo principal do projeto é praticar conceitos fundamentais de desenvolvimento backend, como organização de código, separação de responsabilidades, uso de estruturas de dados e manipulação de entrada do usuário.

---

## ⚙️ Funcionalidades

* Cadastrar novos alertas com:

  * Tipo
  * Descrição
  * Severidade (LOW, MEDIUM, HIGH)
    
* Listar todos os alertas cadastrados
* Filtrar alertas por severidade
* Marcar alertas como resolvidos
* Interface simples via menu interativo no terminal

---

## 🧱 Estrutura do Projeto

```
src/
 ├── Main.java          // Interface com o usuário (menu)
 ├── Alert.java         // Classe modelo do alerta
 └── AlertService.java  // Lógica de negócio e gerenciamento dos alertas
```

---

## 🧠 Conceitos Aplicados

* Orientação a Objetos (classes, métodos, encapsulamento)
* Lógica de programação
* Estruturas de dados (`HashMap`)
* Controle de fluxo (`switch`, `while`)
* Tratamento de exceções (`try/catch`)
* Separação de responsabilidades
* Organização e legibilidade de código

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Compile os arquivos Java:

```bash
javac Main.java Alert.java AlertService.java
```

3. Execute a aplicação:

```bash
java Main
```

4. Utilize o menu exibido no terminal para interagir com o sistema.

---

## 🚀 Melhorias Futuras

* Persistência de dados em banco de dados ou arquivo
* Criação de uma API REST para gerenciamento dos alertas
* Implementação de testes unitários
* Validações mais robustas de entrada do usuário

---

## 🎯 Objetivo Educacional

Este projeto foi desenvolvido com fins **educacionais**, visando consolidar conhecimentos básicos de Java e preparar o terreno para aplicações backend mais robustas no futuro.

---
  um portfólio **muito sólido** 👏💙
