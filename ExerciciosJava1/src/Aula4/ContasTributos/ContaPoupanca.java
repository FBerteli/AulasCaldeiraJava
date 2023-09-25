package Aula4.ContasTributos;

public class ContaPoupanca extends Conta implements Tributos {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularTributos() {
        return 0;
    }
}
