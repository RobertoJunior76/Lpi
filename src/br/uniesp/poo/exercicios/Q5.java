package br.uniesp.poo.exercicios;

//PRÁTICA 2 Questão 5 Atividade 02

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float valorPrestacao;
        float salarioBruto;

        System.out.println("Informe o valor do salário bruto: ");
        salarioBruto = leitor.nextFloat();

        System.out.println("Informe o valor da prestação: ");
        valorPrestacao = leitor.nextFloat();

        if (valorPrestacao > salarioBruto*0.30) {
            System.out.println("Empréstimo não autorizado");
        } else {
            System.out.println("Pode ser concedido empréstimo");
        }

    }
}
