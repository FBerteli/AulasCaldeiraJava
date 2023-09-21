package Aula4.ContasTributos;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;

    public void Sacar(double valor){
        saldo= saldo-valor;
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return + saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
