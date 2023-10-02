package Aula6.AgendaTelefone;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
public class AgendaTelefonica {
    public static void main(String[] args) {
        // Criar um TreeMap para armazenar os contatos em ordem alfabética
        TreeMap<String, Contato> agenda = new TreeMap<>();

        // Adicionar contatos à agenda
        agenda.put("Alice", new Contato("Alice", "123-456-7890", "Rua A", "Norte"));
        agenda.put("Bob", new Contato("Bob", "987-654-3210", "Rua B", "Sul"));
        agenda.put("Carol", new Contato("Carol", "555-123-4567", "Rua C", "Centro"));
        agenda.put("David", new Contato("David", "111-222-3333", "Rua D", "Leste"));
        agenda.put("Eve", new Contato("Eve", "999-888-7777", "Rua E", "Oeste"));

        // Imprimir lista de contatos em ordem alfabética
        System.out.println("Lista de Contatos em Ordem Alfabética:");
        for (Contato contato : agenda.values()) {
            System.out.println(contato);
        }

        // Criar um TreeSet para armazenar os contatos por localidade
        TreeMap<String, TreeSet<Contato>> agendaPorLocalidade = new TreeMap<>();

        // Agrupar os contatos por localidade
        for (Contato contato : agenda.values()) {
            String localidade = contato.getLocalidade();
            agendaPorLocalidade.computeIfAbsent(localidade, k -> new TreeSet<>(Comparator.comparing(Contato::getNome))).add(contato);
        }

        // Imprimir lista de contatos por localidade
        System.out.println("\nLista de Contatos por Localidade:");
        for (String localidade : agendaPorLocalidade.keySet()) {
            System.out.println("Localidade: " + localidade);
            TreeSet<Contato> contatosPorLocalidade = agendaPorLocalidade.get(localidade);
            for (Contato contato : contatosPorLocalidade) {
                System.out.println(contato);
            }
        }
    }
}
