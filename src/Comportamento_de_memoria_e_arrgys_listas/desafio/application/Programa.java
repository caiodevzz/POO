package Comportamento_de_memoria_e_arrgys_listas.desafio.application;

import Comportamento_de_memoria_e_arrgys_listas.desafio.entities.Hotel;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos estudantes vao se hospedar ? ");

        int n = sc.nextInt();

        Hotel[] hotel = new Hotel[10];



        for (int i = 0; i <n ; i++) {
            System.out.println("Hospede " + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto que voce deseja ? ");
            int quartos = sc.nextInt();
            hotel[i] = new Hotel(nome , email);
        }

        for (int i = 0; i < 10 ; i++) {
            if (hotel[i] != null) {
                System.out.println(i + ": " + hotel[i]);
            }
        }

    }
}
