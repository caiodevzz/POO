package exercios_por_fora.Exercios02.produto;

public class produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private static  Double maiorPreco = 0.0;

    public produto(String nome) {
        this.nome = nome;
    }

    public produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        if (preco > maiorPreco) {
            maiorPreco = preco;
        }
    }

    public static Double getMaiorPreco() {
        return maiorPreco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotal () {
        return preco * quantidade;

    }

    public double aplicarDesconto(Double percentual) {
        return preco - (preco * percentual / 100);
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }
}
