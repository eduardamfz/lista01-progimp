package funcoes;
import java.util.Scanner;

public class Questao3_MediaSalarial {

    public static double calculaMedia(double[] salarios, int n){
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + salarios[i];
        }
        return soma / n;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int quantidade = s.nextInt();
        double[] salarios = new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            salarios[i] = s.nextDouble();
        }

        double media = calculaMedia(salarios, quantidade);

        System.out.println("Média salarial: " + arredonda(media, 2));
    }
}
