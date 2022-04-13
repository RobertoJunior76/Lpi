package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "";
        String sexo = "";
        float peso = 0;
        int idade = 0;
        float altura = 0;
        int contPacientes = 0;
        int contHomens = 0;
        float mediaIdadeHomens = 0;
        int mulheresAltPeso = 0;
        int pessoasEntreIdades = 0;
        int idadeVelho = 0;
        String nomeVelho = "";
        float maisBaixa = 0;
        String mulherBaixa = "";

        while (true) {

            System.out.println("CADASTRAR PACIENTE");
            System.out.println("Informe o NOME  do Paciente ou digite 'fim'para sair: ");
            nome = leitor.next();
            if (nome.equals("fim")) {
                break;
            }
            System.out.println("Informe o SEXO do Paciente, utilize 'm' para mulher e 'h' para homem: ");
            sexo = leitor.next();

            System.out.println("Informe o PESO do Paciente (Ex. 85,5): ");
            peso = leitor.nextFloat();

            System.out.println("Informe a IDADE do Paciente: ");
            idade = leitor.nextInt();

            System.out.println("Informe a ALTURA do Paciente (Ex. 1,82): ");
            altura = leitor.nextFloat();
            System.out.println("");

            contPacientes++;

            if (sexo.equals("h")) {
                contHomens++;
                mediaIdadeHomens = (mediaIdadeHomens + idade) / contHomens;
            }
            if (sexo.equals("m") && (altura >= 1.60 && altura <= 1.70) && peso > 70) {
                mulheresAltPeso++;
            }
            if (idade >= 18 && idade <= 25) {
                pessoasEntreIdades++;
            }
            if (idade > idadeVelho) {
                idadeVelho = idade;
                nomeVelho = nome;
            }
            if (sexo.equals("m") && maisBaixa < altura) {
                maisBaixa = altura;
                mulherBaixa = nome;
            }

        }
        System.out.println("\n\n Quantidade de Pacientes: "+ contPacientes);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheresAltPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos: " + pessoasEntreIdades);
        System.out.println("Nome do paciente mais velho: " + nomeVelho);
        System.out.println("Idade do paciente mais velho: " + idadeVelho);
        System.out.println("Nome da mulher mais baixa: " + mulherBaixa);
        System.out.println("");
        leitor.close();


    }


}
