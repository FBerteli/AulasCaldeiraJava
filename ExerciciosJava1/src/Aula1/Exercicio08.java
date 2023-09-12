package Aula1;

import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Gestante");
            System.out.println("2. Idosa");
            System.out.println("3. PCD (Pessoa com Deficiência)");
            System.out.println("4. Nenhuma das alternativas");
            System.out.println("0. Sair");

            System.out.print("Digite o número da opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você tem direito a fila prioritária como gestante.");
                    break;
                case 2:
                    System.out.println("Você tem direito a fila prioritária como pessoa idosa.");
                    break;
                case 3:
                    System.out.println("Você tem direito a fila prioritária como pessoa com deficiência.");
                    break;
                case 4:
                    System.out.println("Você não tem direito a fila prioritária.");
                    break;
                case 0:

                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
