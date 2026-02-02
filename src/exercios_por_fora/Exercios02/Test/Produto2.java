package exercios_por_fora.Exercios02.Test;

import exercios_por_fora.Exercios02.produto.produto;

import java.util.Scanner;

public class Produto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos vc vai levar ? ");
        int n = sc.nextInt();

        produto[] produto = new produto[n];

        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("Digite o " + (i + 1) + " produto");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preco: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            produto[i] = new produto(nome , preco , quantidade);
        }

        System.out.println("Valor total do estoque: ");

        for (int j = 0; j < n; j++) {
           double valorTotal = produto[j].valorTotal();
            System.out.println(valorTotal);
        }

    }
}
