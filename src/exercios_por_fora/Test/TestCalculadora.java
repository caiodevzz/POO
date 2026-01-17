package exercios_por_fora.Test;

import exercios_por_fora.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int somar = calculadora.somar(10 , 3);
        int multiplicar = calculadora.multiplicar(8 , 9);
        int dobro = calculadora.dobro(9);

        System.out.println("somar: " + somar);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dobro: " + dobro);
    }
}
