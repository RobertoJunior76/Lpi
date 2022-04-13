package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double precoLitroGasolina = 2.50;
        double precoRefrigerante = 3;
        double qtdLitros;
        int qtdRefrigerante;
        double totalConta;

        System.out.println("Abasteceu quantos litros: ");
        qtdLitros = leitor.nextDouble();

        System.out.println("Comprou quantos refrigerantes: ");
        qtdRefrigerante = leitor.nextInt();

        totalConta = (qtdLitros * precoLitroGasolina) + (qtdRefrigerante * precoRefrigerante);

        System.out.println("O total da conta do cliente foi: " + totalConta);
    }
}
