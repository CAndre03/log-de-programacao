package variaveis;

import java.util.Scanner;

public class Ex02ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite um número para a operação: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }

        if (number < 0) {
            System.out.println("O número é negativo.");
        } if (number == 0) {
            System.out.println("O número é nulo.");
        } else {
            System.out.println("O número é positivo!");
        }

        scanner.close();


    }
}
