import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {

        double salarioMinimo = 1320.0; // Em reais


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();


        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;


        System.out.println("Você ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");


        scanner.close();
    }
}
