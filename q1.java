package funcoes;
import java.util.Scanner;

public class Questao1_ConversaoTemperatura {

    public static double paraFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }

    public static double paraKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double paraReaumur(double celsius){
        return celsius * 0.8;
    }

    public static double paraRankine(double celsius){
        return celsius * 1.8 + 491.67;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius = s.nextDouble();

        double fahrenheit = paraFahrenheit(celsius);
        double kelvin = paraKelvin(celsius);
        double reaumur = paraReaumur(celsius);
        double rankine = paraRankine(celsius);

        System.out.println("Fahrenheit: " + arredonda(fahrenheit, 3));
        System.out.println("Kelvin: " + arredonda(kelvin, 2));
        System.out.println("Réaumur: " + arredonda(reaumur, 3));
        System.out.println("Rankine: " + arredonda(rankine, 3));
    }
}
