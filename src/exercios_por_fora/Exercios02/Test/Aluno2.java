package exercios_por_fora.Exercios02.Test;

import exercios_por_fora.Exercios02.produto.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Aluno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Quantos alunos voce desjea ver ? ");
        int n = sc.nextInt();

       Aluno[] aluno = new Aluno[n];

       for (int i = 0; i < n; i++) {
           sc.nextLine();
           System.out.println("Dados da " + (i + 1) + " pessoa");
           System.out.print("Nome: ");
           String nome = sc.nextLine();


           System.out.print("Idade: ");
           int idade = sc.nextInt();

           System.out.print("Nota: ");
           double nota = sc.nextDouble();
           sc.nextLine();

           aluno[i] = new Aluno(nome , idade , nota);

       }
        System.out.println();

        System.out.println("Dados de quem passou:");

        for (int i = 0; i < n; i++) {
            aluno[i].aprovado();
        }

        System.out.println();

        for (int j = 0; j < n ; j++) {
            aluno[j].mostrarDados();
        }
    }
}
