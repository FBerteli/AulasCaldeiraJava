package Aula3;

public class ContaBancaria extends Cliente {

    private String nomeBanco;
    private int agencia;
    private int conta;
    private Double saldo;

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
