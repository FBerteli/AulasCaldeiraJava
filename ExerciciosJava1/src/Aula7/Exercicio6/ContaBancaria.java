package Aula7.Exercicio6;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para a retirada. Saldo disponível: " + saldo);
        }
        saldo -= valor;
        System.out.println("Retirada de " + valor + " realizada com sucesso. Saldo restante: " + saldo);
    }
}
