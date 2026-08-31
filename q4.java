package funcoes;
import java.util.Scanner;

public class Questao4_Azulejos {

    public static int calculaAzulejos(double alturaParede, double larguraParede, double alturaAzulejo, double larguraAzulejo){
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;
        double quantidade = areaParede / areaAzulejo;
        return (int) Math.ceil(quantidade);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double alturaParede = s.nextDouble();
        double larguraParede = s.nextDouble();
        double alturaAzulejo = s.nextDouble();
        double larguraAzulejo = s.nextDouble();

        int quantidade = calculaAzulejos(alturaParede, larguraParede, alturaAzulejo, larguraAzulejo);

        System.out.println("Quantidade de azulejos necessários: " + quantidade);
    }
}
