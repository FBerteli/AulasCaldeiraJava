package Aula2;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        String textoAoContrario = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoAoContrario += texto.charAt(i);
        }

        System.out.println("A string ao contrário é: " + textoAoContrario);

        scanner.close();
    }
}
