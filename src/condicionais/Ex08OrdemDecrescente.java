package condicionais;

import java.util.Scanner;

public class Ex08OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Descubra a ordem decrescente da numeração digitada: ";
        System.out.println(menu);
        
        System.out.print("Por favor, digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Por favor, digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Por favor, digite o terceiro número: ");
        int c = scanner.nextInt();
        
        if (a >= b && a >= c) {
            if(b >= c) {
                System.out.println("Segue a ordem decrescente: " + a + " " + b + " " + c);
            } else {
                System.out.println("Segue a ordem decrescente: " + a + " " + c + " " + b);
            }
        } else if (b >= a && b >= c) {
            if(a >= c) {
                System.out.println("Segue a ordem decrescente: " + b + " " + a + " " + c);
            } else {
                System.out.println("Segue a ordem decrescente: " + b + " " + c + " " + a);
            }
        } else if (c >= a && c >= b) {
            if (a >= b) {
                System.out.println("Segue a ordem decrescente: " + c + " " + a + " " + b);
            } else {
                System.out.println("Segue a ordem decrescente: " + c + " " + b + " " + a);
            }
        }

        scanner.close();

    }
}
