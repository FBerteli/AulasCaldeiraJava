package Aula7.Exercicio2;
import java.util.*;
public class SelecionandoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia da semana (em maiúsculas): ");
        String entrada = scanner.nextLine();

        try {
            DiasDaSemana dia = DiasDaSemana.valueOf(entrada); // Converte a entrada em um valor do enum
            switch (dia) {
                case SEGUNDA:
                    System.out.println("É segunda-feira, o início da semana de trabalho.");
                    break;
                case TERCA:
                case QUARTA:
                case QUINTA:
                case SEXTA:
                    System.out.println("É um dia de trabalho comum.");
                    break;
                case SABADO:
                    System.out.println("É sábado, um dia de descanso.");
                    break;
                case DOMINGO:
                    System.out.println("É domingo, um dia de descanso.");
                    break;
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido. Certifique-se de usar letras maiúsculas e verificar a ortografia.");
        }
        scanner.close();
    }
}
