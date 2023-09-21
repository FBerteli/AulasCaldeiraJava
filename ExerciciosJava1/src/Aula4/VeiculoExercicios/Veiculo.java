package Aula4.VeiculoExercicios;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int Ano;

    public Veiculo (String Marca, String Modelo, int ano){
        marca = Marca;
        modelo = Modelo;
        Ano = ano;
    }

    public abstract double calcularCustoViagem(int distancia);
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }
}
