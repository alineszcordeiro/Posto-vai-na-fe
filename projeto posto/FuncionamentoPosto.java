package ProjetoPosto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionamentoPosto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double litrosAcumulados = 0;

        Funcionario funcionario1 = new Funcionario("Leonardo");
        Funcionario funcionario2 = new Funcionario("Rogério");

        BombaCombustivel bombaGasolina1 = new BombaCombustivel(1, 5.49, "Gasolina");
        BombaCombustivel bombaGasolina2 = new BombaCombustivel(2, 5.49, "Gasolina");
        BombaCombustivel bombaAlcool1 = new BombaCombustivel(3, 3.49, "Álcool");
        BombaCombustivel bombaAlcool2 = new BombaCombustivel(4, 3.49, "Álcool");

        Conveniencia loja = new Conveniencia();
        loja.adicionarProduto(new Produto("Água", 4.50));
        loja.adicionarProduto(new Produto("Refrigerante", 8.00));
        loja.adicionarProduto(new Produto("Salgadinho", 7.50));
        loja.adicionarProduto(new Produto("Chocolate", 6.80));

        System.out.println("POSTO E CONVENIÊNCIA VAI NA FÉ:");
        System.out.println("Gasolina R$5.49 | Álcool R$3.49\n");

        int contador = 0;

        while (true) {
            System.out.print("Digite a placa do veículo (ou 0 para encerrar): ");
            String placa = leia.nextLine().trim();
            if (placa.equals("0")) break;

            Veiculo v = (contador % 2 == 0) ? new Carro(placa, 0) : new Moto(placa, 0);

            System.out.println("Cliente com veículo " + v.getPlaca() + ":");
            System.out.println("Deseja abastecer com:\n1 - Gasolina\n2 - Álcool");
            System.out.print("Digite sua escolha: ");
            int escolha = leia.nextInt();

            System.out.print("Quantos litros deseja abastecer? ");
            double litros = leia.nextDouble();
            leia.nextLine();
            v.setLitrosAbastecidos(litros);

            Posto posto;
            if (escolha == 1) {
                posto = (contador % 2 == 0) ? new Posto(bombaGasolina1, funcionario1) : new Posto(bombaGasolina2, funcionario2);
            } else {
                posto = (contador % 2 == 0) ? new Posto(bombaAlcool1, funcionario1) : new Posto(bombaAlcool2, funcionario2);
            }

            double valorAbastecimento = v.getLitrosAbastecidos() * ((escolha == 1) ? bombaGasolina1.getPrecoLitro() : bombaAlcool1.getPrecoLitro());
            posto.atender(v);
            litrosAcumulados += v.getLitrosAbastecidos();

            List<Produto> comprados = new ArrayList<>();
            double totalProdutos = 0;

            System.out.print("Deseja ir à loja de conveniência? (s/n): ");
            String resp = leia.nextLine().trim().toLowerCase();
            if (resp.equals("s")) {
                boolean comprando = true;
                while (comprando) {
                    System.out.println("Produtos disponíveis:");
                    List<Produto> produtos = loja.getProdutos();
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + " - " + produtos.get(i));
                    }
                    System.out.print("Digite o número do produto que deseja comprar (ou 0 para finalizar): ");
                    int opc = leia.nextInt();
                    leia.nextLine();
                    if (opc == 0) break;
                    Produto p = loja.getProdutoPorIndice(opc - 1);
                    if (p != null) {
                        comprados.add(p);
                        totalProdutos += p.getPreco();
                        System.out.println("Produto adicionado ao carrinho: " + p.getNome());
                    }
                }
                System.out.println("Pagamento realizado: R$" + String.format("%.2f", totalProdutos));
            } else {
                System.out.println("Cliente optou por não visitar a loja de conveniência.");
            }

            // Nota Fiscal
            System.out.println("\n----- NOTA FISCAL -----");
            System.out.println("Placa do Veículo: " + v.getPlaca());
            System.out.println("Tipo de Combustível: " + ((escolha == 1) ? "Gasolina" : "Álcool"));
            System.out.println("Litros Abastecidos: " + litros);
            System.out.println("Valor Abastecimento: R$ " + String.format("%.2f", valorAbastecimento));
            if (!comprados.isEmpty()) {
                System.out.println("Produtos Comprados:");
                for (Produto p : comprados) {
                    System.out.println("- " + p.getNome() + ": R$ " + String.format("%.2f", p.getPreco()));
                }
                System.out.println("Total Produtos: R$ " + String.format("%.2f", totalProdutos));
            }
            System.out.println("TOTAL GERAL: R$ " + String.format("%.2f", (valorAbastecimento + totalProdutos)));
            System.out.println("------------------------\n");

            contador++;

            if (litrosAcumulados >= 100.0) {
                System.out.println(">> Caminhão chegou para reabastecer o posto! <<");
                System.out.println(">> Reabastecimento concluído. Posto pronto para atender novamente.\n");
                litrosAcumulados = 0;
            }
        }

        leia.close();
        System.out.println("EXPEDIENTE ENCERRADO.");
    }
}