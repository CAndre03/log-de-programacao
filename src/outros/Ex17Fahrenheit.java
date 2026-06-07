package outros;

import java.util.Scanner;

public class Ex17Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Converta a graus Fahrenheit para Celsius. Digite o valor em Fahrenheit que está querendo " +
                "converter: ");
        double grausFahrenheit = scanner.nextDouble();

        double grausCelsius = (grausFahrenheit - 32) / 1.8;

        System.out.print("O valor correspondente em graus Fahrenheit é: " + grausCelsius + " ºC");

        scanner.close();

    }
}
