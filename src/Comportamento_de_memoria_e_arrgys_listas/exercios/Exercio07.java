package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Locale;
import java.util.Scanner;

public class Exercio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor ?");

        int n = sc.nextInt();

        double[] N = new double[n];

        for (int i =0; i <n; i++) {
            System.out.print("Digite um numero: ");
            N[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i =0; i<n; i++) {
            soma = soma + N[i];
        }

        double medi = soma / n;

        System.out.println("MEIDA DO VETOR: " + medi);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int j=0; j<n; j++) {
            if (N[j] < medi) {
                System.out.println(N[j]);
            }
        }
    }
}
