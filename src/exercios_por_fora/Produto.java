package exercios_por_fora;

public class Produto {
    public String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
        System.out.println("Voce adicionou no estoque: " + this.quantidade);
    }

    public void removerEstoque(int qtd) {
        this.quantidade -= qtd;

        System.out.println("Voce removeu do estoque: " + this.quantidade);
    }

    public double valorTotalEstoque() {
        return this.preco * this.quantidade;
    }

    public void ImoprimirInformacoes() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
