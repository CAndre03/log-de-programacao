package outros;

import java.util.Random;

public class Ex21ValorAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int minimo = 0;
        int maximo = 100;

        int numeroSorteado = random.nextInt(maximo - minimo + 1) + minimo;

        System.out.println("Número sorteado: " + numeroSorteado);



    }
}
