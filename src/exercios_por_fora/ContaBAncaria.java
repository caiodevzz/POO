package exercios_por_fora;

public class ContaBAncaria {
    private String titular;
    private double saldo = 0;

    public ContaBAncaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double deposititar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        this.saldo -= valor;

        if (this.saldo == 0) {
           return this.saldo;
        } else {
           return this.saldo;
        }
    }

    public void verSaldo() {
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Saldo atual: " + this.saldo);
    }
}
