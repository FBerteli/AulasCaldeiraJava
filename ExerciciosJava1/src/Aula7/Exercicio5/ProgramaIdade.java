package Aula7.Exercicio5;
import java.util.*;
public class ProgramaIdade {
    public static int solicitarIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        return idade;
    }
    public static void main(String[] args) {
        try {
            int idade = solicitarIdade();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade fora do intervalo válido (0 a 150).");
            }

            System.out.println("Idade válida: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
