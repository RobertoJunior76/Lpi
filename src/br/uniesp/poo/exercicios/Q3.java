package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float salario;
        String nome = "";
        float salarioReajustado;

        while (true) {
            System.out.println("Informe o nome do funcionário ou digite 'fim' para sair: ");
            nome = leitor.next();

            if (nome.equals("fim")) {
                break;
            } else {
                System.out.println("Informe o salário: ");
                salario = leitor.nextFloat();
                if (salario < 500) {
                    salarioReajustado = salario + (salario * 0.2f);
                    System.out.println("Salário Reajustado em 20%: " + salarioReajustado);
                } else {
                    System.out.println("Você não tem direito ao reajuste");
                }

            }
        }
        leitor.close();
    }
}