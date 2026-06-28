# Game Score Tracker (Java Challenge)

Este repositório contém a resolução de um desafio prático de lógica e sintaxe em **Java**. O objetivo principal foi simular as atualizações de status de um jogador (como vidas, moedas e nível) utilizando manipulações aritméticas.

## Objetivo do Desafio
Praticar e fixar o conceito de operadores unários de **incremento (`++`)** e **decremento (`--`)**. 

## Cenário do Jogo
O programa inicia com os seguintes status:
* `lives = 3`
* `score = 100`
* `level = 1`
* `coins = 5`

A partir daí, uma sequência de eventos acontece em ordem cronológica:
1. O jogador perde 2 vidas (decremento aplicado duas vezes).
2. O jogador coleta 3 moedas (incremento aplicado três vezes).
3. O jogador ganha 1 vida (incremento aplicado uma vez).
4. O jogador avança para o próximo nível (incremento aplicado uma vez).
5. O jogador perde 4 moedas (decremento aplicado quatro vezes).

Ao final, o console exibe o painel de status atualizado do jogador.

##  Tecnologias Utilizadas
* **Java 8+**

---
*Projeto desenvolvido com foco em fundamentos e boas práticas de lógica de programação.*
