package outros;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex15IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o seu nome de usuário: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.print("Por favor, " + nomeDoUsuario + " digite o ano que você nasceu: ");
        int ano = scanner.nextInt();

        System.out.print("Agora, " + nomeDoUsuario + " digite o número do mês que você nasceu: ");
        int mes = scanner.nextInt();

        System.out.print("Por último, " + nomeDoUsuario + " digite número do dia que você nasceu: ");
        int dia = scanner.nextInt();

        LocalDate hoje = LocalDate.now();
        int diaAtual = hoje.getDayOfMonth();
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();

        if (ano > anoAtual || ano < 1900) {
            System.out.println("Ano inválido!");
            return;
        }

        if (diaAtual < dia) {
            diaAtual += 30;
            mesAtual -= 1;
        }
        int idadeDias = diaAtual - dia;

        if (mesAtual < mes) {
            mesAtual += 12;
            anoAtual -= 1;
        }
        int idadeMeses = mesAtual - mes;

        int idadeAnos = anoAtual - ano;

        System.out.printf("Sua idade exata é: %d anos, %d meses e %d dias.%n",
                idadeAnos, idadeMeses, idadeDias);

        scanner.close();

    }
}
