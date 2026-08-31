package funcoes;
import java.util.Scanner;

public class Questao7_Fatorial {

    public static long calculaFatorial(int numero){
        long resultado = 1;
        for(int i = 2; i <= numero; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = s.nextInt();

        long fatorial = calculaFatorial(numero);

        System.out.println("Fatorial: " + fatorial);
    }
}
