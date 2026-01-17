package Comportamento_de_memoria_e_arrgys_listas.exercios.Exercio10.application;

import Comportamento_de_memoria_e_arrgys_listas.exercios.Exercio10.entities.Aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados ?");

        int n = sc.nextInt();

        double media;

        String nomes;

        Aprovados[] aprovados = new Aprovados[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + i + "o aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            aprovados[i] = new Aprovados(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            media = (aprovados[i].getNota1() + aprovados[i].getNota2()) / 2;

            if (media >= 6.0) {
                System.out.println(aprovados[i].getNome());
            }
        }

        sc.close();

    }
}