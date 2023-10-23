package Aula7.Exercicio6;

public class ProgramaContaBancaria {
    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria(1000.0);
            conta.sacar(500.0);
            conta.sacar(700.0); // Isso lançará SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
