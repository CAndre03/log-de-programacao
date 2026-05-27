package variaveis;

import java.util.Scanner;

public class Ex01SomaComparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Por favor, digite o valor de A: ");
            int numberA = scanner.nextInt();

            System.out.print("Por favor, digite o valor de B: ");
            int numberB = scanner.nextInt();

            System.out.print("Por favor, digite o valor de C: ");
            int numberC = scanner.nextInt();

            int soma = numberA +  numberB;
            System.out.print("Valor da soma do valor de A e B: " + soma);

            if (soma < numberC) {
            System.out.println("A soma de A e B é menor que C");
                } else {
                    System.out.println("A soma de A e B não é menor que C");
                }

        scanner.close();
    }

}
