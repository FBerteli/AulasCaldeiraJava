package Aula2;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números primos por vez, com um intervalo entre eles");
        int numeroInicial = input.nextInt();
        int numeroFinal = input.nextInt();


            for (int i = numeroInicial; i < numeroFinal; i++) {
                if (ehPrimo(i))
                    System.out.println(i + " é um número Primo");
            }
            input.close();
        }
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }


}

