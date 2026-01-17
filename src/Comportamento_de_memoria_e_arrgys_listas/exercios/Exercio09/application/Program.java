package Comportamento_de_memoria_e_arrgys_listas.exercios.Exercio09.application;

import Comportamento_de_memoria_e_arrgys_listas.exercios.Exercio09.entities.Pessoa1;
import exercios_por_fora.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar ? ");

        int n = sc.nextInt();
        sc.nextLine();
        int maiorIdade = -1;
        String nomeMaisVelho = "";

        Pessoa1[] pessoas = new Pessoa1[n];


        for (int i = 0; i < n ; i++) {
            System.out.print("Dados da " + i + "a pessoa");
            System.out.println();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            pessoas[i] = new Pessoa1(nome , idade);
            if (idade > maiorIdade) {
               maiorIdade = idade;
               nomeMaisVelho = nome;
            }

        }
        System.out.println("Pessoa mais velha: " + nomeMaisVelho);
        sc.close();
    }
}
