package Aula1;

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        double idadeUsuario = scanner.nextInt();

        System.out.print("Digite o seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        if (idadeUsuario>18&&salarioUsuario>2000){
            System.out.println("Usuário pode comprar um automóvel");
        }
        else {
            System.out.println("Usuário não pode comprar um automóvel!!");
        }
        scanner.close();
    }
}
