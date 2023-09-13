package Aula2;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldadosInimigos = 300000;
        int palpite;

        System.out.println("Leônidas pede para que seus soldados adivinhem quantos inimigos irão enfrentar.");

        do {
            System.out.print("Digite seu palpite (um número inteiro): ");
            palpite = scanner.nextInt();

            if (palpite < soldadosInimigos) {
                System.out.println("Um pouco mais!");
            } else if (palpite > soldadosInimigos) {
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Parabéns! Você acertou o número de soldados inimigos: " + soldadosInimigos);
            }
        } while (palpite != soldadosInimigos);

        scanner.close();
    }
}
