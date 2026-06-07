package loops;

public class Ex18FranciscoSara {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int ano = 0;

        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            ano++;
        }

        System.out.print("Demorou em volta de " + ano + " anos para que Sara ficasse maior que Francisco!" );
    }
}
