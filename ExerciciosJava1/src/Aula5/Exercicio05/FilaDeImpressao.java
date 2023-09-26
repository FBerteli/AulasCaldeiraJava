package Aula5.Exercicio05;

import java.util.LinkedList;
import java.util.Scanner;
public class FilaDeImpressao {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        LinkedList<Impressao> filaDeImpressao = new LinkedList<>();
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar um documento à fila de impressão");
            System.out.println("2. Imprimir um documento da fila de impressão");
            System.out.println("3. Exibir a fila de impressão");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do documento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int numeroPaginas = scanner.nextInt();

                    Impressao documento = new Impressao(nome, numeroPaginas);
                    filaDeImpressao.addLast(documento);
                    System.out.println("Documento adicionado à fila de impressão.\n");
                    break;

                case 2:
                    if (!filaDeImpressao.isEmpty()) {
                        Impressao documentoASerImpresso = filaDeImpressao.removeFirst();
                        System.out.println("Imprimindo documento:");
                        System.out.println(documentoASerImpresso);
                        System.out.println("Documento impresso com sucesso!\n");
                    } else {
                        System.out.println("A fila de impressão está vazia.\n");
                    }
                    break;

                case 3:
                    if (!filaDeImpressao.isEmpty()) {
                        System.out.println("Fila de Impressão:");
                        for (Impressao documento : filaDeImpressao) {
                            System.out.println(documento);
                        }
                    } else {
                        System.out.println("A fila de impressão está vazia.\n");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
    }
}