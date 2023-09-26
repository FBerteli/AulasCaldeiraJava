package Aula5.Exercicio04;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Compras> listaDeCompras = new ArrayList<>();

        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar um item à lista");
            System.out.println("2. Remover um item da lista");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Data de validade (opcional): ");
                    String dataValidade = scanner.nextLine();

                    Compras item = new Compras(nome, dataValidade);
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado à lista de compras.\n");
                    break;
                case 2:
                    if (!listaDeCompras.isEmpty()) {
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i).getNome());
                        }

                        System.out.print("Informe o número do item a ser removido: ");
                        int numeroItem = scanner.nextInt();

                        if (numeroItem >= 1 && numeroItem <= listaDeCompras.size()) {
                            listaDeCompras.remove(numeroItem - 1);
                            System.out.println("Item removido da lista de compras.\n");
                        } else {
                            System.out.println("Número de item inválido.\n");
                        }
                    } else {
                        System.out.println("A lista de compras está vazia.\n");
                    }
                    break;

                case 3:
                    if (!listaDeCompras.isEmpty()) {
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println("Item " + (i + 1) + ":\n" + listaDeCompras.get(i));
                        }
                    } else {
                        System.out.println("A lista de compras está vazia.\n");
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
