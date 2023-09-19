package Aula3;

public class TesteRaio {
    public static void main(String[] args) {

        Raio circulo1 = new Raio(5.0);
        Raio circulo2 = new Raio(2.5);

        System.out.println("Círculo 1 - Raio: " + circulo1.raio);
        System.out.println("Área do Círculo 1: " + circulo1.calcularArea());
        System.out.println("Circunferência do Círculo 1: " + circulo1.calcularCircunferencia());

        System.out.println("Círculo 2 - Raio: " + circulo2.raio);
        System.out.println("Área do Círculo 2: " + circulo2.calcularArea());
        System.out.println("Circunferência do Círculo 2: " + circulo2.calcularCircunferencia());
    }
}
