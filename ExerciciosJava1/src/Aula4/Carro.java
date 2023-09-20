package Aula4;

public class Carro extends Veiculo {

    public Carro(String Marca, String Modelo, int ano) {
        super(Marca, Modelo, ano);
    }
    public int calcularCustoViagem(Double distancia) {
            System.out.println("O custo da distancia percorrida é " + distancia * 0.20);
        return 0;
    }

}