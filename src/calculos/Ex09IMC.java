package calculos;

import java.util.Scanner;

public class Ex09IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Descubra seu índice de massa corporal (IMC). Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: (Digite em metros)");
        double altura = scanner.nextDouble();

        double calculoImc = peso / (altura * altura);

        if (calculoImc < 18.5) {
            System.out.printf("Seu IMC é %.2f - você está abaixo do peso.%n", calculoImc);

        } else if (calculoImc < 25.0) {
            System.out.printf("Seu IMC é %.2f - você está no peso ideal (parabéns!).%n", calculoImc);

        } else if (calculoImc < 30.0) {
            System.out.printf("Seu IMC é %.2f - você está levemente acima do peso.%n", calculoImc);

        } else if (calculoImc < 35.0) {
            System.out.printf("Seu IMC é %.2f - você está com obesidade grau I.%n", calculoImc);

        } else if (calculoImc < 40.0) {
            System.out.printf("Seu IMC é %.2f - você está com obesidade grau II (severa).%n", calculoImc);

        } else {
            System.out.printf("Seu IMC é %.2f - você está com obesidade grau III (mórbida).%n", calculoImc);
        }

       scanner.close();

    }
}
