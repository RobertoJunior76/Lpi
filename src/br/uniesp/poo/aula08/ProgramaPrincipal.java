package br.uniesp.poo.aula08;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Usuario romeu = new Usuario( "Romeu", leitor.lerIdade());


    }

}
