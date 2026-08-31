package funcoes;
import java.util.Scanner;

public class Questao9_NotasTurma {

    public static double calculaMediaAluno(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String calculaSituacao(double media){
        if(media >= 7)
            return "Aprovado";
        if(media >= 5)
            return "Recuperação";
        return "Reprovado";
    }

    public static double calculaMediaGeral(double[] medias, int n){
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + medias[i];
        }
        return soma / n;
    }

    public static double arredonda(double valor, int casas){
        double fator = Math.pow(10, casas);
        return Math.round(valor * fator) / fator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int quantidadeAlunos = s.nextInt();
        double[] medias = new double[quantidadeAlunos];

        for(int i = 0; i < quantidadeAlunos; i++){
            double nota1 = s.nextDouble();
            double nota2 = s.nextDouble();
            double nota3 = s.nextDouble();

            double media = calculaMediaAluno(nota1, nota2, nota3);
            medias[i] = media;

            String situacao = calculaSituacao(media);

            System.out.println("Aluno " + (i + 1) + " - Média: " + arredonda(media, 1) + " - " + situacao);
        }

        double mediaGeral = calculaMediaGeral(medias, quantidadeAlunos);
        System.out.println("Média geral da turma: " + arredonda(mediaGeral, 1));
    }
}
