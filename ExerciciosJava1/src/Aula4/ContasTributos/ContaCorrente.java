package Aula4.ContasTributos;

public class ContaCorrente extends Conta implements Tributos{
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularTributos() {
        return getSaldo() * 0.01;
    }
}
