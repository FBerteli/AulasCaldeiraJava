package Aula4.ContasTributos;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(5000);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosTotal = 0;

        Tributos[] tributaveis = { contaCorrente, contaPoupanca, seguroDeVida };

        for (Tributos tributavel : tributaveis) {
            double tributos = tributavel.calcularTributos();
            System.out.println("Tributos a pagar: R$" + tributos);
            tributosTotal += tributos;
        }

        System.out.println("Total de tributos a pagar: R$" + tributosTotal);
    }
}
