package funcoes;
import java.util.Scanner;

public class Questao10_CaixaLoja {

    public static double calculaTotal(double[] precos, int n){
        double total = 0;
        for(int i = 0; i < n; i++){
            total = total + precos[i];
        }
        return total;
    }

    public static double calculaDesconto(double total){
        if(total > 500)
            return total * 0.15;
        if(total > 200)
            return total * 0.10;
        return 0;
    }

    public static double calculaValorFinal(double total, double desconto){
        return total - desconto;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] precos = new double[1000];
        int quantidade = 0;

        double preco = s.nextDouble();
        while(preco != 0){
            precos[quantidade] = preco;
            quantidade++;
            preco = s.nextDouble();
        }

        double total = calculaTotal(precos, quantidade);
        double desconto = calculaDesconto(total);
        double valorFinal = calculaValorFinal(total, desconto);

        System.out.println("Total da compra: " + arredonda(total, 2));
        System.out.println("Desconto: " + arredonda(desconto, 2));
        System.out.println("Valor final: " + arredonda(valorFinal, 2));
    }
}
