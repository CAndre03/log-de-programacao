package calculos;

import java.util.Scanner;

public class Ex12Pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoProduto = "Processador AMD Ryzen 3600G";
        double valorDoProduto = 800.0;


        String tabelaDeCodigoPg = """
                Digite a opção de pagamento de sua preferência : 
                1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
                
                2 - À Vista no cartão de crédito, recebe 10% de desconto
                
                3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
                
                4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
                
                """;
        System.out.println("Carrinho: " + nomeDoProduto);
        System.out.print(tabelaDeCodigoPg);
        int opcaoSelecionada = scanner.nextInt();

        double valorTotal = 0;

        if (opcaoSelecionada == 1) {
            valorTotal = valorDoProduto * 0.85;
            System.out.printf("Opção selecionada : à vista no dinheiro ou PIX. Total a pagar: R$ %.2f%n", valorTotal);
        } else if (opcaoSelecionada == 2) {
            valorTotal = valorDoProduto * 0.90;
            System.out.printf("Opção selecionada : à vista no crédito. Total a pagar: R$ %.2f%n", valorTotal);
        } else if (opcaoSelecionada == 3) {
            valorTotal = valorDoProduto;
            System.out.printf("Opção selecionada : parcelado em duas vezes. Total a pagar: R$ %.2f%n", valorTotal);
        } else if (opcaoSelecionada == 4) {
            valorTotal = valorDoProduto * 1.10;
            System.out.printf("Opção selecionada : parcelado em três vezes. Total a pagar: R$ %.2f%n", valorTotal);
        } else {
            System.out.println("Opção selecionada incorreta!");
        }

        scanner.close();


    }
}
