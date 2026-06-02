package condicionais;

import java.util.Scanner;

public class Ex07Booleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você atualmente é maior de idade? Verdadeiro ou falso?");
        boolean a = scanner.nextBoolean();

        System.out.println("Você contém CNH? Verdadeiro ou falso?");
        boolean b = scanner.nextBoolean();

        if(a && b) {
            System.out.println("Você respondeu ambas como verdadeiro.");
        } else if (!a && !b) {
            System.out.println("Você respondeu ambas como falso");
        } else {
            System.out.println("Você respondeu uma como verdadeiro e outra como falso");
        }

        scanner.close();

    }
}
