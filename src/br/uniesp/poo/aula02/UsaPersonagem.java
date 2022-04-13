package br.uniesp.poo.aula02;

public class UsaPersonagem {

    public static void main(String[] args) {

        Personagem baby = new Personagem();
        Personagem mole = new Personagem();
        Personagem bravo = new Personagem();

        baby.nome = " Baby Yoda";
        baby.idade = 3;
        mole.nome = " Mole mole";
        mole.idade = 15;
        bravo.nome = " Bravo bravo";
        bravo.idade = 20;

        baby.exibirNome();
        baby.exibirIdade();
        mole.exibirNome();
        mole.exibirIdade();
        bravo.exibirNome();
        bravo.exibirIdade();

    }
}
