package variaveis;

import java.util.Scanner;

public class Ex04AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite um número para teste: ");
        int number = scanner.nextInt();

        int numberA = number - 1;
        int numberS = number + 1;

        System.out.println("O número digitado é " + number + " seu sucessor é " + numberS + " e seu antecessor é  " + numberA);


    }



}
