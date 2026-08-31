package funcoes;
import java.util.Scanner;

public class Questao11_AnaliseNumeros {

    public static int maiorNumero(int[] numeros, int n){
        int maior = numeros[0];
        for(int i = 1; i < n; i++){
            if(numeros[i] > maior)
                maior = numeros[i];
        }
        return maior;
    }

    public static int menorNumero(int[] numeros, int n){
        int menor = numeros[0];
        for(int i = 1; i < n; i++){
            if(numeros[i] < menor)
                menor = numeros[i];
        }
        return menor;
    }

    public static int quantidadePares(int[] numeros, int n){
        int quantidade = 0;
        for(int i = 0; i < n; i++){
            if(numeros[i] % 2 == 0)
                quantidade++;
        }
        return quantidade;
    }

    public static double calculaMedia(int[] numeros, int n){
        int soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + numeros[i];
        }
        return (double) soma / n;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 10;

        int[] numeros = new int[total];
        for(int i = 0; i < total; i++){
            numeros[i] = s.nextInt();
        }

        int maior = maiorNumero(numeros, total);
        int menor = menorNumero(numeros, total);
        int pares = quantidadePares(numeros, total);
        double media = calculaMedia(numeros, total);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Média: " + arredonda(media, 1));
    }
}
