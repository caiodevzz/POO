package exercios_por_fora.Exercios02.Test;

import exercios_por_fora.Exercios02.produto.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Voce quer abrir conta nesse banco? ");
        char n = sc.nextLine().charAt(0);

        if (n == 'S' || n == 's') {
            System.out.print("Quantas contas vc deseja abrir nesse banco? ");
            int b = sc.nextInt();

            ContaBancaria[] contas = new ContaBancaria[b];

            for (int i = 0; i < b; i++) {
                sc.nextLine(); // limpar buffer

                System.out.println("Digite os dados da " + (i + 1) + " conta:");
                System.out.print("Nome: ");
                String titular = sc.nextLine();

                System.out.print("Numero: ");
                int numero = sc.nextInt();

                System.out.print("Saldo: ");
                double saldo = sc.nextDouble();

                contas[i] = new ContaBancaria(titular, numero, saldo);
            }

            System.out.println("\nSacando 8.243 de todas as contas:\n");

            for (int j = 0; j < b; j++) {
                contas[j].sacar(8.243);
                contas[j].mostrarConta();
                System.out.println();
            }
        }
    }
}
