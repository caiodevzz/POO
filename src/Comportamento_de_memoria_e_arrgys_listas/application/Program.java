package Comportamento_de_memoria_e_arrgys_listas.application;

import Comportamento_de_memoria_e_arrgys_listas.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i =0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name , price);
        }

        double soma = 0.0;

        for (int i =0; i <n; i++) {
            soma += vect[i].getPrice();
        }

        double agv = soma / n;

        System.out.printf("Resultado %.2f%n" , agv);


        sc.close();
    }
}
