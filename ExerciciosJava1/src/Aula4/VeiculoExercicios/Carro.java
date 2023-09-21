package Aula4.VeiculoExercicios;

public class Carro extends Veiculo {

    public Carro(String Marca, String Modelo, int ano) {
        super(Marca, Modelo, ano);
    }
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.20;
    }

}