package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Scanner;

public class Exercio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter em cada vetor ?");

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i <n ; i++) {
            b[i] = sc.nextInt();
        }


        for (int j =0; j <n; j++) {
            c[j] = a[j] + b[j] ;
        }

        System.out.println("VETOR RESULTANTE");

        for (int i = 0; i <n ; i++) {
            System.out.println(c[i]);
        }
    }
}
