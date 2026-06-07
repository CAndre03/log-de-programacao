package outros;

import java.util.Scanner;

public class Ex16Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descubra o tipo do seu triângulo. Digite a medida do primeiro lado: ");
        int ladoA = scanner.nextInt();

        System.out.print("Digite a medida do segundo lado: ");
        int ladoB = scanner.nextInt();

        System.out.print("Digite a medida do terceiro lado: ");
        int ladoC = scanner.nextInt();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Seu triângulo é equilátero!");
            } else if (ladoA == ladoB || ladoC == ladoB || ladoA == ladoC) {
                System.out.println("Seu triângulo é isósceles!");
            } else {
                System.out.println("Seu triângulo é escaleno!");
            }
        } else {
            System.out.println("Esses lados não formam um triângulo válido!");
        }


        scanner.close();
    }
}
