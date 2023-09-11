import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        double idadeUsuario = scanner.nextDouble();

        if(idadeUsuario<16){
            System.out.println("Usuário não pode votar!!");
        }
        if (idadeUsuario>16&&idadeUsuario<17){
            System.out.println("Voto do usuário é facultativo");
        }
        if (idadeUsuario>65){
            System.out.println("Voto do usuário é facultativo");
        }
        if (idadeUsuario>18&&idadeUsuario<65){
            System.out.println("Voto do usuário é obrigatório!!");
        }
    }


}
