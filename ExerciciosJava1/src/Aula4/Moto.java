package Aula4;

public class Moto extends Veiculo{

    public Moto(String Marca, String Modelo, int ano) {
        super(Marca, Modelo, ano);
    }

    public void calcularCustoViagem(int distancia) {
        if (distancia >= 0) {
            System.out.println("O custo da distancia percorrida é " + distancia * 0.15);

        }
    }
}
