package exercios_por_fora.Test;

import exercios_por_fora.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol" , 2003 , 108);

        carro.informacoes();
        carro.acelerar(87);
        carro.dimininurVelocidade(20);
    }
}
