package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double calcularEmprestimo;

        System.out.println("Informe o nome do usuário: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Informe a idade do usuário entre 18 e 23: ");
        int idade = leitor.nextInt();

        System.out.println("Informe o valor do empréstimo: ");
        double valorEmprestimo = leitor.nextFloat();

        System.out.println("Informe o percentual juros mês: ");
        double percentualJurosMes = leitor.nextFloat();

        System.out.println("Informe a quantidade de meses para pagar: ");
        int mesesParaPagar = leitor.nextInt();

        System.out.println("Será impresso todos os atributos da classe empréstimo: ");
        System.out.println("Nome do Usuário:" + nomeUsuario);
        System.out.println("A Idade do Usuário: " + idade);
        System.out.println("O valor do Empréstimo: " + valorEmprestimo);
        System.out.println(" O percentual de Juros Mês: " + percentualJurosMes);
        System.out.println("A Quantidade de meses para pagar: " + mesesParaPagar);

        if (idade >= 18 && idade < 23) {
            calcularEmprestimo = ((valorEmprestimo) + ((valorEmprestimo/mesesParaPagar) * (percentualJurosMes/100)));
            System.out.println("O Cálculo do empréstimo ficou: " + calcularEmprestimo);

        }
        if (idade > 23 && idade <= 33) {
            calcularEmprestimo = ((valorEmprestimo) + ((valorEmprestimo * 10) / 100));
            System.out.println("O Cálculo do empréstimo ficou: " + calcularEmprestimo);
        }


        


    }


}
