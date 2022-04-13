package br.uniesp.poo.exercicios;


import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){


    Scanner leitor = new Scanner(System.in);
    int contador = 0;
    int valor;

    while (contador < 10) {
        System.out.println("Informe o valor a verificar: ");
        valor = leitor.nextInt();
        if (valor % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        contador ++;

    }

}


}
