# 📘 Sistema de Notas - NotasV1

Este projeto é um programa simples em **Java** que permite o cadastro de **três alunos**, a leitura de suas notas e o cálculo da média para verificar se cada um foi **aprovado** ou **reprovado**.

---

## 🚀 Funcionalidades
- Cadastro de **3 alunos** (nome e notas).
- Leitura de **3 notas por aluno**.
- Cálculo automático da **média** de cada aluno.
- Exibição do resultado final:
  - ✅ Aprovado (média maior ou igual a 6)  
  - ❌ Reprovado (média menor que 6)

---

## 📂 Estrutura do Código
O programa é composto por:
- Classe principal: `NotasV1`
- Método `main`: controla o fluxo do programa (cadastro, cálculo e exibição dos resultados).
- Método auxiliar `lerNota`: responsável por receber 3 notas de cada aluno e retornar a soma.

---

## 🖥️ Exemplo de Execução

=== Sistema de Notas ===
Digite o nome do aluno 1:
Maria
Digite a primeira nota de :
7
Digite a segunda nota de :
8
Digite a terceira nota de :
6
Maria foi aprovado com média 7.0

Digite o nome do aluno 2:
João
Digite a primeira nota de :
4
Digite a segunda nota de :
5
Digite a terceira nota de :
3
João foi reprovado com média 4.0

Digite o nome do aluno 3:
Ana
Digite a primeira nota de :
9
Digite a segunda nota de :
8
Digite a terceira nota de :
10
Ana foi aprovado com média 9.0
