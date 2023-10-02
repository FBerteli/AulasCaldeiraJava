package Aula6.GerenciadorLivros;
import java.util.Stack;
public class SistemaDeLivros {
    public static void main(String[] args) {
        Stack<livros> pilhaDeLivros = new Stack<>();

        // Inicializa a pilha com alguns livros
        pilhaDeLivros.push(new livros("O Senhor dos Anéis", "Fantasia"));
        pilhaDeLivros.push(new livros("1984", "Ficção Científica"));
        pilhaDeLivros.push(new livros("Dom Quixote", "Clássico"));
        pilhaDeLivros.push(new livros("A Revolução dos Bichos", "Ficção Política"));

        // Imprime os elementos da pilha
        System.out.println("Livros na pilha:");
        for (livros livro : pilhaDeLivros) {
            System.out.println(livro);
        }

        // Imprimir com base na categoria
        String categoriaDesejada = "Fantasia";
        System.out.println("\nLivros na categoria '" + categoriaDesejada + "':");
        for (livros livro : pilhaDeLivros) {
            if (livro.getCategoria().equals(categoriaDesejada)) {
                System.out.println(livro);
            }
        }

        // Remover até que a pilha esteja vazia
        System.out.println("\nRemovendo livros da pilha:");
        while (!pilhaDeLivros.isEmpty()) {
            livros livroRemovido = pilhaDeLivros.pop();
            System.out.println("Livro removido: " + livroRemovido.getTitulo());
        }

        // Verificar se a pilha está vazia
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("\nA pilha de livros está vazia.");
        }
    }
}
