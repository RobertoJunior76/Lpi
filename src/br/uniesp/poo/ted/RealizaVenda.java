package br.uniesp.poo.ted;



public class RealizaVenda {

    public static void main(String[] args) {
        double desconto;
        double valor;
        double comissao;

        //VENDA 1:
        Produto produto1 = new Produto(27, "Bermuda", 150, 50, "Não");
        Vendedor vendedor1 = new Vendedor("Luiz", "Bessa", 1);
        new Venda(produto1, vendedor1, 2, 0);



        System.out.println("\n\nINFORMAÇÒES DA VENDA 1: ");
        desconto = Venda.efetuarDesconto(produto1.getValorVenda());
        valor = Venda.calcularValor(Venda.getQuantidadeItens(), produto1.getValorVenda(), desconto);

        comissao = Venda.calcularComissao(valor);
        Venda.exibe();
        System.out.println("Valor da comissão do vendedor: R$ " + comissao);

        //VENDA 2:
        Produto produto2 = new Produto(12, "Camisa Polo", 240, 120, "Não");
        Vendedor vendedor2 = new Vendedor("Roberto Júnior", "Intermares", 3);
        new Venda(produto2, vendedor2, 4, 0);

        System.out.println("\n\n INFORMAÇÕES DA VENDA 2: ");
        desconto = Venda.efetuarDesconto(produto2.getValorVenda());
        valor = Venda.calcularValor(Venda.getQuantidadeItens(), produto1.getValorVenda(), desconto);

        comissao = Venda.calcularComissao(valor);
        Venda.exibe();
        System.out.println("Valor da comissão do vendedor: R$ " + comissao);

        //VENDA 3:
        Produto produto3 = new Produto(4, "Calça", 300, 150, "Sim");
        Vendedor vendedor3 = new Vendedor("Rodrigo", "Manaíra", 7);
        new Venda(produto3, vendedor3, 2, 50);

        System.out.println("\n\nINFORMAÇÕES DA VENDA 3: ");
        desconto = Venda.efetuarDesconto(produto3.getValorVenda());
        valor = Venda.calcularValor(Venda.getQuantidadeItens(), produto3.getValorVenda(), desconto);

        comissao = Venda.calcularComissao(valor);
        Venda.exibe();
        System.out.println("Valor da comissão do vendedor: R$ " + comissao);


    }
}
