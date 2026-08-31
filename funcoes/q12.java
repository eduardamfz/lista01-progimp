package funcoes;
import java.util.Scanner;

public class Questao12_EstatisticasNumeros {

    public static int calculaSoma(int[] numeros, int n){
        int soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + numeros[i];
        }
        return soma;
    }

    public static double calculaMedia(int[] numeros, int n){
        return (double) calculaSoma(numeros, n) / n;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

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

    public static int quantidadeImpares(int[] numeros, int n){
        int quantidade = 0;
        for(int i = 0; i < n; i++){
            if(numeros[i] % 2 != 0)
                quantidade++;
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = new int[1000];
        int quantidade = 0;

        int valor = s.nextInt();
        while(valor != -1){
            numeros[quantidade] = valor;
            quantidade++;
            valor = s.nextInt();
        }

        int soma = calculaSoma(numeros, quantidade);
        double media = calculaMedia(numeros, quantidade);
        int maior = maiorNumero(numeros, quantidade);
        int menor = menorNumero(numeros, quantidade);
        int pares = quantidadePares(numeros, quantidade);
        int impares = quantidadeImpares(numeros, quantidade);

        System.out.println("Quantidade de números: " + quantidade);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + arredonda(media, 1));
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
