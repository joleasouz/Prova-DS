### Opção 4: O "Filtro de Streamer" (Cálculo de Donates/Sub)

**Cenário:** Um streamer da Twitch/YouTube quer saber quanto ele vai receber "limpo" no final do mês após as taxas das plataformas.

- **Entradas (POST):** Valor Total de Donates, Número de "Subs" (Inscrições) e Plataforma (Twitch ou YouTube).
- **Lógica de Cálculo:**
    - Na **Twitch**, a plataforma fica com 50% do valor dos Subs.
    - No **YouTube**, a taxa é de 30%.
    - **Desafio:** Se o valor final for menor que R$ 100,00, exibir um aviso: "Saldo insuficiente para saque mínimo".