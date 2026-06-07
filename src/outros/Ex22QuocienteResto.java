package outros;

import java.util.Scanner;

public class Ex22QuocienteResto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calcule o quociente de uma divisão e o resto da divisão entre eles. Digite o valor de A: ");
        int valorA = scanner.nextInt();

        System.out.print("Agora, digite o valor de B: ");
        int valorB = scanner.nextInt();

        if (valorB == 0) {
            System.out.println("Erro: divisão por zero não é permitida!");
        } else {
            int quociente = valorA / valorB;
            int resto = valorA % valorB;
            System.out.print("O quociente dos dois números digitados é " + quociente + " e o resto de sua divisão é : " + resto);
        }

        scanner.close();
    }
}
