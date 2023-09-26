package Aula5.Exercicio04;

public class Compras {
    private String nome;
    private String dataValidade;

    public Compras(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Validade: " + dataValidade + "\n";
    }
}
