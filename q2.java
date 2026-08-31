package funcoes;
import java.util.Scanner;

public class Questao2_AlturaSexo {

    public static double maiorAltura(double[] alturas, int n){
        double maior = alturas[0];
        for(int i = 1; i < n; i++){
            if(alturas[i] > maior)
                maior = alturas[i];
        }
        return maior;
    }

    public static double menorAltura(double[] alturas, int n){
        double menor = alturas[0];
        for(int i = 1; i < n; i++){
            if(alturas[i] < menor)
                menor = alturas[i];
        }
        return menor;
    }

    public static double mediaAlturaHomens(double[] alturas, int[] sexos, int n){
        double soma = 0;
        int quantidade = 0;
        for(int i = 0; i < n; i++){
            if(sexos[i] == 2){
                soma = soma + alturas[i];
                quantidade++;
            }
        }
        return soma / quantidade;
    }

    public static int quantidadeMulheres(int[] sexos, int n){
        int quantidade = 0;
        for(int i = 0; i < n; i++){
            if(sexos[i] == 1)
                quantidade++;
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 10;

        int[] sexos = new int[total];
        double[] alturas = new double[total];

        for(int i = 0; i < total; i++){
            sexos[i] = s.nextInt();
            alturas[i] = s.nextDouble();
        }

        double maior = maiorAltura(alturas, total);
        double menor = menorAltura(alturas, total);
        double mediaHomens = mediaAlturaHomens(alturas, sexos, total);
        int mulheres = quantidadeMulheres(sexos, total);

        System.out.println("Maior altura: " + maior + " m");
        System.out.println("Menor altura: " + menor + " m");
        System.out.println("Média de altura dos homens: " + mediaHomens + " m");
        System.out.println("Número de mulheres: " + mulheres);
    }
}
