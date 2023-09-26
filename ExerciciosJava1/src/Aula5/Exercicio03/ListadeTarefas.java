package Aula5.Exercicio03;
import java.util.ArrayList;
import java.util.Scanner;
public class ListadeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar uma tarefa");
            System.out.println("2. Remover uma tarefa");
            System.out.println("3. Exibir todas as tarefas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    Tarefas tarefa = new Tarefas(titulo, data, descricao);
                    listaDeTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!\n");
                    break;

                case 2:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeTarefas.get(i).getTitulo());
                        }

                        System.out.print("Informe o número da tarefa a ser removida: ");
                        int numeroTarefa = scanner.nextInt();

                        if (numeroTarefa >= 1 && numeroTarefa <= listaDeTarefas.size()) {
                            listaDeTarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida com sucesso!\n");
                        } else {
                            System.out.println("Número de tarefa inválido.\n");
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia.\n");
                    }
                    break;

                case 3:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println("Tarefa " + (i + 1) + ":\n" + listaDeTarefas.get(i));
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia.\n");
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
