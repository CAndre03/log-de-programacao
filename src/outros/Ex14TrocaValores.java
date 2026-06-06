package outros;

import java.util.Scanner;

public class Ex14TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Por favor, digite o valor de B: ");
        int b = scanner.nextInt();

        int cAuxiliar;

        cAuxiliar = a;
        a = b;
        b = cAuxiliar;

        System.out.print("Valores trocados, A e B respectivamente : " + a + " " + b);

        scanner.close();
    }
}
