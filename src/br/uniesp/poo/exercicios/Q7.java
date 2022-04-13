package br.uniesp.poo.exercicios;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String cliente = " ";
        float precoDiaria = 40;
        int qtdDiaria;
        int contCliente = 0;
        float valorContaCliente;
        float faturamentoTotalPousada = 0;

        while (true) {

            System.out.println("Informe o nome do hóspede ou digite 'fim' para sair: ");
            cliente = leitor.next();
            if (cliente.equals("fim")) {
                break;
            }
            System.out.println("Informe a quantidade de diárias: ");
            qtdDiaria = leitor.nextInt();

            if (qtdDiaria < 10) {
                valorContaCliente = qtdDiaria * (precoDiaria + 15);
                


            }
            else {
                valorContaCliente = qtdDiaria * (precoDiaria + 8);


            }
        contCliente ++;
            faturamentoTotalPousada = faturamentoTotalPousada + valorContaCliente;





            System.out.println("A conta do cliente: "+ cliente + "foi no valor " + valorContaCliente);
            System.out.println("Número total de clientes: " + contCliente);
            System.out.println("Total Arrecadado pela pousada: " + faturamentoTotalPousada );
        }




    }


}
