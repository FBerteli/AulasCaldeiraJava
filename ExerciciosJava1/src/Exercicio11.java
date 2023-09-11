import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine().toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na Frase/Palavra: " + contadorVogais);

        scanner.close();
    }
}
