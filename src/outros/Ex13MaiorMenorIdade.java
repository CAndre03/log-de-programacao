package outros;

import java.util.Scanner;

public class Ex13MaiorMenorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome de usuário: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.print("Por favor, " + nomeDoUsuario + " digite sua idade para verificação: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Opção válida. Usuário maior de idade!");
        } else {
            System.out.println("Opção inválida. Usuário menor de idade");
        }

        scanner.close();
    }
}
