package Aula4;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int Ano;
    private Double Taxa;


    public void calcularCustoViagem(int distancia){
        System.out.println("O custo da distancia percorrida é ");
    }

    public Double getTaxa() {
        return Taxa;
    }

    public void setTaxa(Double taxa) {
        Taxa = taxa;
    }

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
