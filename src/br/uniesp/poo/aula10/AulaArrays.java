package br.uniesp.poo.aula10;

import br.uniesp.poo.aula07.Animal;

public class AulaArrays {

    public static void main(String[] args) {

        int[] numeros = {3, 5, 7, 6, 10};
        int[] listaNumeros = new int[5];
        //var outroNumeros = new int[10]; são as mesmas formas para declarar um array//
        listaNumeros[4] = 20;
        listaNumeros[3] = 19;
        listaNumeros[0] = 50;

        Animal[] lista = new Animal[10];
        lista[0] = new Animal();
        lista[0].setEspecie("viralata");
        System.out.println(lista[0].getEspecie());

        //vai dar o tamanho do array, o length//
        System.out.println(listaNumeros.length);

        //percorrer um array com duas formas diferente usando o for//
        for (int valor: listaNumeros) {
            System.out.println(valor);
        }

        for (int x = 0; x< listaNumeros.length; x++) {
            System.out.println(listaNumeros[x]);
        }
    }

}
