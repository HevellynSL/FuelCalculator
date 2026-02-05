# Fuel Calculator

- Aplicativo Android desenvolvido para auxiliar no cálculo dos custos de combustível em viagens de carro.
- O utilizador informa o preço do combustível, o consumo médio do carro e a distância até o destino, e o app calcula automaticamente a despesa total.

## :camera_flash: Screenshots

<p align="center">
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/ed4d173a-cd4f-46d6-9035-7af5cbda407a" width="160"/>
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/f2c82fb5-5a5b-4869-a421-bc3e9d5fa20b" width="160"/>
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/27644560-a720-4fe5-b3dc-2caecbe6d053" width="160"/>
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/dcf5312d-d292-4ebe-ac06-d3f312eed44a" width="160"/>
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/a21f38fa-b811-4fe5-8dda-f71caf64be83" width="160"/>
  <img src="https://github.com/HevellynSL/calculadoraimc_/assets/155830522/591b13d9-e519-4c84-8f9f-d50b3f4ca815" width="160"/>
  <img width="1919" height="1141" alt="Capture d&#39;écran 2026-02-05 194358" src="https://github.com/user-attachments/assets/3a6bc4dd-21fa-4d8d-ae2f-3aa82425fbbc" />
</p>

## 🛠️ Tecnologias e Bibliotecas

- **Linguagem:** Kotlin
- **IDE:** Android Studio
- **Arquitetura:** Single Activity Architecture
- **Navegação:** Jetpack Navigation Component (Fragments & NavGraph)
- **UI Components:** - View Binding 
  - ConstraintLayout & LinearLayout
  - Material Design (Snackbar, Buttons, etc)

## 🚀 Funcionalidades

- Cálculo automático do gasto de combustível para viagens.
- Interface amigável e intuitiva.
- Revisão dos dados inseridos antes de apresentar o resultado.
- **Navegação Fluida:** Transições otimizadas entre telas sem recarregar Activities.

## 🏗️ Evolução da Arquitetura

Recentemente, o projeto passou por uma refatoração significativa para adotar padrões modernos de desenvolvimento Android, focando em performance e manutenibilidade.

| Recurso | Implementação Anterior | Implementação Atual (Refatorada) |
| :--- | :--- | :--- |
| **Estrutura de Telas** | Múltiplas Activities | **Single Activity + Fragments** |
| **Fluxo de Navegação** | Intents manuais e acoplados | **Jetpack Navigation Component** |
| **Gerenciamento de Pilha** | Controle manual do Backstack | **Navigation Graph (XML)** automático |
| **Performance** | Maior overhead de memória | Consumo de recursos otimizado |
| **Transição de Dados** | Bundles manuais entre Activities | **Safe Args** para passagem de parâmetros |

---

### Créditos e Recursos
- **Imagens:** [vectorjuice](https://www.freepik.com/free-vector/sightseeing-tour-landmark-visit-milestone-accomplishment-moving-forward-roadmap-progress-decorative-design-element-gps-navigation-location-pin_12146023.htm), [storyset](https://www.freepik.com/free-vector/front-car-concept-illustration_20863876.htm) e [pch.vector](https://www.freepik.com/free-vector/upset-man-filling-tank-car-with-gasoline-biodiesel-happy-person-saving-money-by-riding-skateboard-flat-vector-illustration-finances-economy-fuel-transportation-concept-banner_24645016.htm) no Freepik.
- **Ícone:** [pch.vector](https://www.freepik.com/free-vector/upset-man-filling-tank-car-with-gasoline-biodiesel-happy-person-saving-money-by-riding-skateboard-flat-vector-illustration-finances-economy-fuel-transportation-concept-banner_24645016.htm) no Freepik.
