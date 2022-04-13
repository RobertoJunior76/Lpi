package br.uniesp.poo.aula03;

import java.util.Scanner;

public class ExercicioAtividade2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Informe a idade: ");
        int idade = leitor.nextInt();

        System.out.println("Informe o valor do empréstimo: ");
        float valorEmprestimo = leitor.nextFloat();

        System.out.println("Informe o percentual juros mês: ");
        float percentualJurosMes = leitor.nextFloat();

        System.out.println("Informe a quantidade de meses para pagar: ");
        int mesesParaPagar = leitor.nextInt();




    }

}
