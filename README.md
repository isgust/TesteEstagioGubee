**Teste para processso seletivo de Estagio em Java da Gubee**

**Problema: Gerenciamento de Bateria de Laptop Gamer**

**Descrição:**

Você adquiriu um novo laptop gamer e, devido ao uso intensivo, a bateria precisa ser recarregada frequentemente. Para gerenciar melhor o uso, é necessário criar uma função que calcule a porcentagem final da bateria após uma sequência de eventos de uso e carregamento.

**Funcionalidade:**

A função `getBattery` recebe uma lista de inteiros, onde cada elemento representa um evento:
- **Valores positivos:** indicam minutos de carregamento.
- **Valores negativos:** indicam minutos de uso (o laptop consome 1% de bateria por minuto).

A bateria não pode ultrapassar 100% de carga, e a carga inicial é sempre 50%.

**Exemplo de uso:**

- **Entrada:**
    - `eventos = [10, -20, 61, -15]`

- **Processo:**
    1. **Carga inicial:** 50%
    2. **Evento [0] (10 min carregando):** 50% + 10% = 60%
    3. **Evento [1] (20 min jogando):** 60% - 20% = 40%
    4. **Evento [2] (61 min carregando):** 40% + 61% = 101% -> limitado a 100%
    5. **Evento [3] (15 min jogando):** 100% - 15% = 85%

- **Saída esperada:** 85

**Descrição da função:**

- **`getBattery(eventos)`:**
    - **Parâmetro:** `eventos` (lista de inteiros)
    - **Retorno:** um número inteiro que representa a porcentagem final da bateria.
