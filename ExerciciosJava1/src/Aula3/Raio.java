package Aula3;

public class Raio {
    public double raio;

    public Raio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

}
