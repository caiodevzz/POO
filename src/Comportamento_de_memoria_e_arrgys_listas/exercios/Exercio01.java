package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Scanner;

public class Exercio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];



        for (int i = 0; i <n; i++) {
            System.out.println("Digite um numero");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

       for (int i =0; i <n; i++) {
           if (vect[i] < 0) {
               System.out.println(vect[i]);
           }
        }
    }
}
