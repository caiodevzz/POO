package exercios_por_fora;

public class Carro {
    public String modelo;
    private int ano;
    private int velocidadeAtual = 0;

    public Carro(String modelo, int ano, int velocidadeAtual) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int km) {
        this.velocidadeAtual += km;

        System.out.println("Voce alererou com : " + this.velocidadeAtual);
    }

    public void dimininurVelocidade(int km) {
        this.velocidadeAtual -= km;

        System.out.println("Voce desacelerou com: " + this.velocidadeAtual);
    }

    public void informacoes() {
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Ano de fabricaçao: " + this.ano);
        System.out.println("Velocidade maxima: " + this.velocidadeAtual);
    }
}
