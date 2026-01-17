package Comportamento_de_memoria_e_arrgys_listas.exercios;

import java.util.Locale;
import java.util.Scanner;

public class Exercios05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i =0; i <n; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
        }

        int posmaior = 0;
        double maior = 0.0;

        maior = vect[0];

        for (int j=0; j <n; j++) {
            if (vect[j] > 13) {
                System.out.println("MAIOR VALOR: " + vect[j]);
            }
        }

        for (int i=1; i<n; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posmaior = i;
            }
        }
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

    }
}
