### Opção 1: O Simulador de Frete "Logística Express"

**Cenário:** Uma transportadora precisa de um sistema que calcule o valor do frete com base na distância e no peso da mercadoria.

- **Requisitos Técnicos:**
    - Um formulário (POST) para captar: Distância (km), Peso (kg) e Tipo de Envio (Normal ou Expresso).
    - **Lógica de Cálculo:**
        - Valor base: R$ 10,00.
        - Cobrar R$ 0,50 por km rodado.
        - Se o peso for maior que 20kg, adicionar uma taxa de R$ 30,00.
        - Se o envio for "Expresso", o valor total aumenta em 20%.
        

---