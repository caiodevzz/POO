package Tests;

import Produto.Banco;

import java.util.Scanner;

public class BancoTest01 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);


        System.out.print("Digite o numero da sua conta: ");
        int numeroDaConta = Banco.numero = sc.nextInt();
        String espacoInvisvel = sc.nextLine();

        System.out.print("Digite seu nome: ");
        banco.nome = sc.nextLine();

        System.out.print("Voce quer depositar quantos ? (S/N) ");
        char condicao1 = sc.next().charAt(0);

        if (condicao1 == 'S') {
            System.out.print("Valor inicial que vc quer depositar: ");
           double valor = sc.nextDouble();

           banco.depositar(valor);
        }

        System.out.println("Voce quer continuar o atendimento (Sair" +
                "-------------------------------------------------------------------------------------------------------------------- , Sacar , Informacoes) ?");
                String condicao2 = sc.next();
                System.out.println();

        switch (condicao2) {
            case "Informacçoes":
                System.out.println("Informacçoes: ");
                banco.informacoes();

            case "Sacar":
                System.out.print("Qunatos voce quer sacar ?");
                banco.sacar(sc.nextDouble(), 0.5);

            case "Sair":
                System.out.println("Atendimento encerrado:");
                banco.informacoes();

            default:
                System.out.println("Solicite uma opeçao do menu.");
        }


        sc.close();
    }
}
