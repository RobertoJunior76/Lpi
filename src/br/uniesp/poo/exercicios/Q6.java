package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int totalAlunosExame = 0;
        int totalAlunosReprovados = 0;
        int totalAlunosAprovados = 0;
        float notaUm;
        float notaDois;
        float media;
        float mediaClasse = 0;

        for(int x = 1; x < 7; x++) {
            System.out.println("Dados do Aluno " + x);
            System.out.println("Informe a nota 1 ");
            notaUm = leitor.nextFloat();
            System.out.println("Informe a nota 2 " );
            notaDois = leitor.nextFloat();
            media = (notaUm + notaDois) / 2;
            System.out.println("A média do aluno"+x + ":" + media);
            mediaClasse = (mediaClasse + media);


            if(media >= 7){
                ++totalAlunosAprovados;
            }
            else if (media < 3 ){

                ++totalAlunosReprovados;
            }
            else {
                ++totalAlunosExame;
            }
        }
        mediaClasse = mediaClasse / 6;
        System.out.println("Alunos Aprovados: " + totalAlunosAprovados);
        System.out.println("Alunos Reprovados: " + totalAlunosReprovados);
        System.out.println("A média da classe é: " + mediaClasse);
        System.out.println("Total de Alunos no Exame: " + totalAlunosExame);



    }

}
