package br.uniesp.poo.aula03;

import javax.swing.*;

public class UsaCalculadora {

     public static void main(String[] args) {

         Calculadora calculadora = new Calculadora();
         calculadora.somar(5, 8);
         int resposta = calculadora.subtrair(6, 5);

         System.out.println("Resposta: " + resposta);

         String nome = JOptionPane.showInputDialog("Digite seu nome ");
         JOptionPane.showMessageDialog( null, nome);



    }
}
