package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Scanner;

public class Exercio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] N = new int[n];
        int somaPares = 0;
        int contadorPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            N[i] = sc.nextInt();
            if (N[i] % 2 == 0) {
                somaPares += N[i];
                contadorPares++;
            }
        }

        if (contadorPares > 0) {
            double mediaPares = (double) somaPares / contadorPares;
            System.out.printf("Média dos números pares: %.2f\n", mediaPares);
        } else {
            System.out.println("Não há números pares no vetor.");
        }


        sc.close();
    }
}
