package exercios_por_fora.Exercios02.produto;

public class ContaBancaria {
    private String titular;
    private Integer numero;
    private Double saldo;

    public ContaBancaria(String titular, Integer numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public ContaBancaria(String titular, Integer numero, Double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        return valor += this.saldo;
    }

    public double sacar(double valor) {
        return this.saldo -= valor;
    }

    public void mostrarConta() {
        System.out.println("Nome: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Numero: " + this.numero);
    }
}
