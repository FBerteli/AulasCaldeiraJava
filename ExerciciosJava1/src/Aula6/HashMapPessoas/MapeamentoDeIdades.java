package Aula6.HashMapPessoas;
import java.util.HashMap;
import java.util.Map;
public class MapeamentoDeIdades {
    public static void main(String[] args) {
        // Criar um HashMap para associar nomes a idades
        Map<String, Integer> mapaDeIdades = new HashMap<>();

        mapaDeIdades.put("Alice", 25);
        mapaDeIdades.put("Bob", 60);
        mapaDeIdades.put("Carol", 70);
        mapaDeIdades.put("David", 30);
        mapaDeIdades.put("Eve", 80);

        // Acessar e imprimir a idade de um nome específico
        String nomeParaBuscar = "Bob";
        if (mapaDeIdades.containsKey(nomeParaBuscar)) {
            int idade = mapaDeIdades.get(nomeParaBuscar);
            System.out.println(nomeParaBuscar + " tem " + idade + " anos.");
        } else {
            System.out.println(nomeParaBuscar + " não está presente no mapa.");
        }

        // Imprimir nomes das pessoas que estão na terceira idade (idade >= 60)
        System.out.println("\nPessoas na terceira idade:");
        for (Map.Entry<String, Integer> entrada : mapaDeIdades.entrySet()) {
            String nome = entrada.getKey();
            int idade = entrada.getValue();
            if (idade >= 60) {
                System.out.println(nome + " (" + idade + " anos)");
            }
        }
    }
}
