import java.util.Calendar;

public class Exercicio5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();


        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);


        int milissegundos = calendar.get(Calendar.MILLISECOND);
        if (milissegundos >= 500) {
            segundo++;
        }


        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;


        int segundosAteMeiaNoite = 86400 - segundosDesdeMeiaNoite;


        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos que faltam para a meia-noite: " + segundosAteMeiaNoite);
    }
}
