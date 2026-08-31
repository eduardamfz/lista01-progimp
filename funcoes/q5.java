package funcoes;
import java.util.Scanner;

public class Questao5_VolumeLata {

    public static double calculaVolume(double raio, double altura){
        return Math.PI * raio * raio * altura;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double raio = s.nextDouble();
        double altura = s.nextDouble();

        double volume = calculaVolume(raio, altura);

        System.out.println("Volume da lata de óleo: " + arredonda(volume, 2) + " m³");
    }
}
