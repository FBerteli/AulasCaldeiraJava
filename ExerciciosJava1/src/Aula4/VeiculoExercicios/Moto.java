package Aula4.VeiculoExercicios;

public class Moto extends Veiculo{

    public Moto(String Marca, String Modelo, int ano) {
        super(Marca, Modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.15;
    }
}

