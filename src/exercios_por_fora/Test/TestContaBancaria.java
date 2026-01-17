package exercios_por_fora.Test;

import exercios_por_fora.ContaBAncaria;

public class TestContaBancaria {
    public static void main(String[] args) {
        ContaBAncaria contaBAncaria = new ContaBAncaria("Caio" , 900.00);

        contaBAncaria.verSaldo();
       double depositar = contaBAncaria.deposititar(10.932);
        double sacar = contaBAncaria.sacar(9);

        System.out.println("Voce depostou R$ " + depositar);
        System.out.println("Voce sacou: " + sacar);
    }
}
