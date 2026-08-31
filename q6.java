package funcoes;
import java.util.Scanner;

public class Questao6_PotenciaElevacao {

    public static double calculaPotenciaHp(double massa, double altura, double tempo){
        double gravidade = 9.81;
        double potenciaWatts = (massa * gravidade * altura) / tempo;
        return potenciaWatts / 745.6999;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double massa = s.nextDouble();
        double altura = s.nextDouble();
        double tempo = s.nextDouble();

        double potenciaHp = calculaPotenciaHp(massa, altura, tempo);

        System.out.println("Potência necessária: " + arredonda(potenciaHp, 3) + " hp");
    }
}
