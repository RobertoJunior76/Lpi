package br.uniesp.poo.aula08;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {

    Scanner leitor = new Scanner(System.in);
    public int lerIdade(){

        int idade = -1;
        System.out.println("Informe a idade");
        try {
            idade = leitor.nextInt();

        } catch (InputMismatchException ie) {
          System.out.println("Erro 001 de input: São aceitos apenas número");



        } catch (Exception e) {
            System.out.println("Erro 002 de input: São aceitos apenas números");


        } finally {
            System.out.println("Sempre passa por aqui, sempre será executado");
        }

        return idade;

       




    }


}
