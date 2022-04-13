package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valorCredito;
        double percentualAumento;
        double novoAumento;

        System.out.println("Informe o valor do crédito: ");
        valorCredito = leitor.nextFloat();

        System.out.println("Informe o percentual de aumento: ");
        percentualAumento = leitor.nextFloat();

        novoAumento = valorCredito * (percentualAumento/100);

        System.out.println("O Crédito com o novo aumento é: " + novoAumento);

    }
}
