package br.uniesp.poo.ted;

public class Venda {

    static Produto produto;
    static Vendedor vendedor;
    static double desconto;
    static int quantidadeItens;
    static double valor;
    static double valorComissao;

    public Venda(Produto produto, Vendedor vendedor, int quantidadeItens, double desconto) {
        Venda.produto = produto;
        Venda.vendedor = vendedor;
        Venda.desconto = desconto;
        Venda.quantidadeItens = quantidadeItens;
    }

    public static void exibe() {
        System.out.println("CÓDIGO DO VENDEDOR: " + vendedor.getCodigo());
        System.out.println("NOME DO VENDEDOR: " + vendedor.getNome());
        System.out.println("COMISSÃO PELA VENDA: " + vendedor.getComissao());
        System.out.println("QUANTIDADE DE ITENS VENDIDOS: " + quantidadeItens);
        System.out.println("CÓDIGO DO PRODUTO: " + produto.getCodigo());
        System.out.println("DESCRIÇÃO DO PRODUTO: " + produto.getDescricao());
        System.out.println("VALOR DA VENDA: " + produto.getValorVenda());
        System.out.println("PRODUTO EM PROMOÇÃO: " + produto.getPromocao());
        System.out.println("TOTAL DA VENDA: " + valor);




    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        Venda.produto = produto;
    }

    public  Vendedor getVendedor() {
        return vendedor;
    }

    public  void setVendedor(Vendedor vendedor) {
        Venda.vendedor = vendedor;
    }

    public static int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        Venda.quantidadeItens = quantidadeItens;
    }

    public static double efetuarDesconto(double valorVenda) {
        desconto = valorVenda * (desconto / 100);
        return desconto;
    }

    public static double calcularValor (int quantidadeItens, double valorVenda, double desconto) {
        valorVenda = valorVenda - desconto;
        if (valorVenda < produto.getValorCusto()) {
            System.out.println("Valor de venda do produto é menor que o valor de custo, então venda cancelada");
            System.exit(0);
        }
        valor = valorVenda * quantidadeItens;
        return valor;

    }
    public  static double calcularComissao(double valor) {
        vendedor.setComissao(10);
        if (produto.getPromocao().equals("Sim")){
            vendedor.setComissao(vendedor.getComissao()/2);
        }
        valorComissao = valor * (vendedor.getComissao()/100);
        return valorComissao;

        }


    }





