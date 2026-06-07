package calculos;

import java.util.Scanner;

public class Ex23SalarioLiquido {
    public static void main(String[] args) {
        String menu = "Professor, descubra o valor do seu salário líquido. ";
        System.out.print(menu);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula (Cada aula corresponde a 01 hora): ");
        double valorDaHoraAula = scanner.nextDouble();

        System.out.print("Quantos aulas você deu durante o mês? ");
        int quantidadeDeAulas = scanner.nextInt();

        System.out.println("Qual é seu percentual de desconto do INSS?");
        double descontoInss = scanner.nextDouble();

        double salarioBruto = (quantidadeDeAulas * valorDaHoraAula);
        double valorTotal =  salarioBruto - (salarioBruto * (descontoInss / 100));


        System.out.printf("Seu salário líquido será de: R$ %.2f%n", valorTotal);

        scanner.close();


    }
}
