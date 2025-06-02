# Posto-Vai-na-Fé
Repositório destinado a simulação de um posto de gasolina com conveniência e nota fiscal.

Este é um projeto em Java que simula o funcionamento de um posto de combustível com bombas, funcionários, uma loja de conveniência e geração de nota fiscal detalhada. Ideal para praticar conceitos de Programação Orientada a Objetos (POO) como:

- Herança e abstração
- Interfaces
- Encapsulamento
- Composição de objetos
- Separação de responsabilidades por classe

---

## 📁 Estrutura do Projeto

O projeto contém as seguintes classes:

| Arquivo                  | Função                                                               |
|--------------------------|-----------------------------------------------------------------------|
| `Abastecivel.java`       | Interface que define o método de abastecimento                        |
| `Veiculo.java`           | Classe abstrata para veículos, implementa `Abastecivel`               |
| `Carro.java` / `Moto.java` | Subclasses específicas de veículos                                  |
| `Funcionario.java`       | Representa um funcionário que realiza e recebe pagamento              |
| `BombaCombustivel.java`  | Representa uma bomba com preço e tipo de combustível                  |
| `Produto.java`           | Representa um produto vendido na loja de conveniência                 |
| `Conveniencia.java`      | Contém a lista de produtos disponíveis na loja                        |
| `Posto.java`             | Classe que junta uma bomba e um funcionário para atender veículos     |
| `FuncionamentoPosto.java`| Classe principal (`main`) que executa o sistema completo              |

---

## ✅ Funcionalidades

- 🛻 Entrada de veículos com placa alternando entre carros e motos
- ⛽ Escolha do tipo de combustível (Gasolina ou Álcool)
- 🧾 Cálculo automático de valor por litros abastecidos
- 👷 Atendimento por dois funcionários revezando entre bombas
- 🛒 Acesso à loja de conveniência com múltiplos produtos
- 🧾 Emissão de nota fiscal com valor total de abastecimento e compras
- 🚛 A cada 100 litros abastecidos, o posto é automaticamente reabastecido por um caminhão

---

## 🧪 Exemplo de Execução

POSTO E CONVENIÊNCIA VAI NA FÉ:
- Gasolina R$5.49 | Álcool R$3.49
- Digite a placa do veículo (ou 0 para encerrar): ABC1234
- Cliente com veículo ABC1234:
- Deseja abastecer com:
- 1 - Gasolina
- 2 - Álcool
- Digite sua escolha: 1
- Quantos litros deseja abastecer? 20
- Deseja ir à loja de conveniência? (s/n): s
- Produtos disponíveis:
- 1 - Água - R$4.5
- 2 - Refrigerante - R$8.0
- 3 - Salgadinho - R$7.5
- 4 - Chocolate - R$6.8
- Digite o número do produto que deseja comprar (ou 0 para finalizar): 1
- Produto adicionado ao carrinho: Água
...

======= NOTA FISCAL =======

- Placa do Veículo: ABC1234
- Tipo de Combustível: Gasolina
- Litros Abastecidos: 20.0
- Preço por Litro: R$ 5.49
- Valor Abastecimento: R$ 109.80
- Produtos Comprados:
- Água: R$ 4.50
- Total Produtos: R$ 4.50
- TOTAL GERAL: R$ 114.30
  
===========================

---

Professor: Luis Roberto Guerreiro

Disciplina: ALP2

📌 Observações
- O sistema aceita entrada de veículos indefinidamente até o usuário digitar 0
- O reabastecimento do posto é automático e ocorre após cada 100 litros acumulados
- Os preços de combustível e produtos podem ser alterados diretamente no código
