package Produto;

public class Banco {
    public static int numero;
    public String nome;
    private double valor;


    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void setNumero(int numero) {
        Banco.numero = numero;
    }

    public double getValor() {
        return valor;
    }



    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(double deposito) {
        this.valor += deposito ;

        System.out.println("Voce depositou: " + deposito + " saldo: " + this.valor);
    }

    public void sacar(double sacar , double taxa) {
       double total = sacar + taxa;

       this.valor -= total;
    }

    public void informacoes() {
        System.out.println("Numero da conta: " + Banco.numero);
        System.out.println("Propriatario da conta: " + this.nome);
        System.out.println("Saldo da conta: " + this.valor);
    }
}
