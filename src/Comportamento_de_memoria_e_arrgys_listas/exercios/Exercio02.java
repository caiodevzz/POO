package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Locale;
import java.util.Scanner;

public class Exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i =0; i < n; i++) {
            System.out.println("Digite um numero");
            vect[i] = sc.nextDouble();
        }

        for (int i =0; i <n; i++) {
            System.out.printf("Valores  %.2f%n" , vect[i]);
             }

            double soma = 0.0;

            for (int i =0; i <n; i++) {
                soma += vect[i];
            }

        System.out.printf("SOMA: %.2f%n" , soma);

        double avg = soma / n;

        System.out.println("Media " + avg);
        }
    }

