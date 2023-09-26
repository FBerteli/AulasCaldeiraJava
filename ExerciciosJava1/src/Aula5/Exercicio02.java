package Aula5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.println("Array gerado automaticamente com 10 números inteiros entre 1 e 100.");

        System.out.print("Digite um número para verificar se está presente no array: ");
        int numeroVerificar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroVerificar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroVerificar + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroVerificar + " não foi encontrado no array.");
        }

        scanner.close();
    }
}
