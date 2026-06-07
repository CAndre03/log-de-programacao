package loops;

import java.util.Scanner;

public class Ex20TabuadaNumero {
    public static void main(String[] args) {
        String menu = "Descubra a tabuada de qualquer número, apenas digitalize-o: ";
        System.out.print(menu);

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
