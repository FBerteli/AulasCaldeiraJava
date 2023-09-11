import java.util.Scanner;
import java.util.Calendar;
public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos");

        scanner.close();
    }
}
