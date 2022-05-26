package br.uniesp.poo.aula10;

import java.util.Arrays;

public class ManipulandoArrays {

    public static void main(String[] args) {

        int[] lista = new int[10];
        int[] segundaLista = new int[10];
        //Preenche toda lista com 10 e 2//
        Arrays.fill(lista, 10);
        Arrays.fill(segundaLista, 2);

        //imprimindo a posição 3 na lista e o 9 na segundaLista//
        System.out.println(lista[3]);
        System.out.println(segundaLista[9]);

        for (int valor: lista){
            System.out.println(valor);
        }
        for (int valor: segundaLista) {
            System.out.println(valor);
        }
        //Comparando os Arrays para verificar se tem algum item igual//
        if (Arrays.equals(lista, segundaLista)) {
            System.out.println("Iguais");
        } else{
            System.out.println("Diferente");
        }

    }

}
