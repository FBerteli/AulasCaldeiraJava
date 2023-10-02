package Aula6.GerenciadorLivros;
public class livros {
    private String titulo;
    private String categoria;

    public livros(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Categoria: " + categoria;
    }
}


