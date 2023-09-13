package Aula2;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int comprimento = texto.length();

        if (comprimento % 2 == 0) {
            int metade = comprimento / 2;
            String primeiraMetade = texto.substring(0, metade);
            System.out.println("A primeira metade da string é: " + primeiraMetade);
        } else {
            System.out.println("A string não pode ser dividida em duas metades iguais.");
        }

        scanner.close();
    }
}
