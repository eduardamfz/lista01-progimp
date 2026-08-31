package funcoes;
import java.util.Scanner;

public class Questao8_ConversaoSegundos {

    public static int calculaHoras(int totalSegundos){
        return totalSegundos / 3600;
    }

    public static int calculaMinutos(int totalSegundos){
        return (totalSegundos % 3600) / 60;
    }

    public static int calculaSegundosRestantes(int totalSegundos){
        return totalSegundos % 60;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalSegundos = s.nextInt();

        int horas = calculaHoras(totalSegundos);
        int minutos = calculaMinutos(totalSegundos);
        int segundos = calculaSegundosRestantes(totalSegundos);

        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
