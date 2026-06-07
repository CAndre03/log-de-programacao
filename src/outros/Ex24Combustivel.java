package outros;

import java.util.Scanner;

public class Ex24Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade média que você vai colocar em seu veículo: ");
        int velocidade = scanner.nextInt();


        System.out.println("em quanto tempo? ");
        double hora = scanner.nextDouble();

        double distancia = hora * velocidade;
        double litros = distancia / 12;

        System.out.println("Considerando suas informações, você vai percorrer " + distancia + " KM. Além disso, terá consumo " +
                "médio de: " + litros + " litros de combustível.");

        scanner.close();

    }
}
