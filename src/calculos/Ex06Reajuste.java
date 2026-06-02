package calculos;

import java.util.Scanner;

public class Ex06Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o valor que será reajustado: ");
        double valor = scanner.nextDouble();

        double valorReajustado = valor + (valor * 0.05);

        System.out.println("Segue o valor com o reajuste de 05%: " + valorReajustado);

        scanner.close();

    }
}
