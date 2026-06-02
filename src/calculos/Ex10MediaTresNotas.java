package calculos;

import java.util.Scanner;

public class Ex10MediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[3];
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

        scanner.close();
    }
}
