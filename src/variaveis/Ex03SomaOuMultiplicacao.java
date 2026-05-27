package variaveis;

import java.util.Scanner;

public class Ex03SomaOuMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o valor de A: ");
        int numberA = scanner.nextInt();

        System.out.print("Por favor, digite o valor de B: ");
        int numberB = scanner.nextInt();

        int numberC = 0;

        if (numberA == numberB) {
            numberC = numberA + numberB;

        } else {
            numberC = numberA * numberB;

        }

        System.out.println("O valor de C é: " + numberC);

        scanner.close();

    }

}
