package Aula1;

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, insira um número não negativo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            int fatorialArredondado = Math.round(fatorial);

            System.out.println("O fatorial de " + numero + " é aproximadamente " + fatorialArredondado);
        }
        scanner.close();
    }
}
