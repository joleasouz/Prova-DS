### Opção 3: O "Calculador de XP" (Sistema de RPG/Games)

**Cenário:** Um novo jogo de RPG precisa de uma página para calcular se o jogador subiu de nível após uma missão.

- **Entradas (POST):** Nível Atual, XP Acumulado e Dificuldade da Missão (Fácil, Média, Difícil).
- **Lógica de Cálculo:**
    - Cada missão dá uma base de 100 XP.
    - Se a dificuldade for **Média**, multiplica por 1.5. Se for **Difícil**, multiplica por 2.0.
    - **O "Level Up":** Se o novo total de XP for maior que 1000, exibe uma mensagem: "PARABÉNS! Você subiu para o nível X+1".
