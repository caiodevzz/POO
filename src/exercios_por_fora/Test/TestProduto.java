package exercios_por_fora.Test;

import exercios_por_fora.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Gelo" , 10.73 , 4);

        produto.ImoprimirInformacoes();
        produto.adicionarEstoque(63);
        produto.removerEstoque(15);


        double valorDoEstoque = produto.valorTotalEstoque();

        System.out.printf("Valor do estoque: R$ " + valorDoEstoque);

    }
}
