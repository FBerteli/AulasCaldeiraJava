package Aula4.VeiculoExercicios;

public class TesteVeiculo {
    public static void main(String[] args) {
    Carro c1 = new Carro("Chevrolet", "Zafira", 2006);
        System.out.println("O custo da viagem foi R$"+c1.calcularCustoViagem(200));
    }
}
