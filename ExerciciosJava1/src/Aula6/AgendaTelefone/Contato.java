package Aula6.AgendaTelefone;

public class Contato {
    private String nome;
    private String numeroTelefone;
    private String endereco;
    private String localidade;

    public Contato(String nome, String numeroTelefone, String endereco, String localidade) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + numeroTelefone + "\nEndereço: " + endereco + "\nLocalidade: " + localidade + "\n";
    }
}
