package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Scanner;

public class Exercio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero vc quer digitar ?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i =0; i <n; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextInt();
        }

        int quantidade = 0;


        System.out.println("NUMEROS PARES:");

        for (int i = 0; i <vect.length ; i++) {
            if (vect[i] % 2 == 0) {

                System.out.println(vect[i]);
                quantidade++;
            }
        }

        System.out.println("Quantidade de pares:");
        System.out.println(quantidade);
    }
}
