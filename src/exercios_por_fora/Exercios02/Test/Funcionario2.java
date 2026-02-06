package exercios_por_fora.Exercios02.Test;

import exercios_por_fora.Exercios02.entities.Funcionario;

import java.util.Scanner;

public class Funcionario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios vc vai digitar ? ");

        int n = sc.nextInt();

        Funcionario[] funcionarios = new Funcionario[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite os dados do " + (i + 1) + " funcionario: ");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();

            funcionarios[i] = new Funcionario(nome, salario, horasTrabalhadas);

        }

        System.out.println("MEDIA SALARIAL DO FUNCIONARIO");

        for (int j = 0; j < n ; j++) {
            funcionarios[j].calcularSalario();
        }

        System.out.println("Litas dos funcionarios: ");

        for (int l = 0; l < n ; l++) {
            System.out.println("---------------------------");
            funcionarios[l].mostrarFuncionario();
        }
    }
}
