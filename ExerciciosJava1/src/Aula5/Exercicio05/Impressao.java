package Aula5.Exercicio05;

public class Impressao {
    private String nome;
    private int numeroPaginas;

    public Impressao(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nome + "\nNúmero de Páginas: " + numeroPaginas + "\n";
    }
}
