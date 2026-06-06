package calculos;

import java.util.Scanner;

public class Ex11MediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.print("Digite o nome do aluno que será armazenado as notas: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a notas do aluno: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.printf("A média das notas é: %.2f%n", media);
        if (media >= 7) {
            System.out.println("O aluno " + nome + " foi aprovado!");
        } else {
            System.out.println("O aluno " + nome + " foi reprovado!");
        }


        scanner.close();



    }
}
