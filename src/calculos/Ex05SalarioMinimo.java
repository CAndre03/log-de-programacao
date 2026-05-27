package calculos;

import java.util.Scanner;

public class Ex05SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorBaseDoSalarioMinimo = 1293.20;

        System.out.print("Usuário, digite seu salário: ");
        double valorSalarioUsuario = scanner.nextDouble();

        double media = valorSalarioUsuario / valorBaseDoSalarioMinimo;

        System.out.printf("Seu salário, atualmente no país, está em média entre %.2f salários mínimos.%n", media);

        scanner.close();
    }
}
