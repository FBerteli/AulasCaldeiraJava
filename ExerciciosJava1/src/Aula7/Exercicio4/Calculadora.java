package Aula7.Exercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.print("Digite a operação desejada (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            Operacao operacao = null;

            switch (operador) {
                case '+':
                    operacao = Operacao.ADICAO;
                    break;
                case '-':
                    operacao = Operacao.SUBTRACAO;
                    break;
                case '*':
                    operacao = Operacao.MULTIPLICACAO;
                    break;
                case '/':
                    operacao = Operacao.DIVISAO;
                    break;
                default:
                    System.out.println("Operação inválida. Use +, -, *, /.");
                    break;
            }

            if (operacao != null) {
                Calculavel calculadora = new MinhaCalculadora();

                switch (operacao) {
                    case ADICAO:
                        System.out.println("Resultado: " + calculadora.adicionar(numero1, numero2));
                        break;
                    case SUBTRACAO:
                        System.out.println("Resultado: " + calculadora.subtrair(numero1, numero2));
                        break;
                    case MULTIPLICACAO:
                        System.out.println("Resultado: " + calculadora.multiplicar(numero1, numero2));
                        break;
                    case DIVISAO:
                        try {
                            System.out.println("Resultado: " + calculadora.dividir(numero1, numero2));
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
