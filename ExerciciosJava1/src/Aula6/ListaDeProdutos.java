package Aula6;

import java.util.LinkedHashMap;
import java.util.Map;
public class ListaDeProdutos {
    public static void main(String[] args) {
        // Criar um LinkedHashMap para associar produtos a preços na ordem de inserção
        LinkedHashMap<String, Double> mapaDeProdutos = new LinkedHashMap<>();

        // Adicionar produtos e seus preços ao mapa
        mapaDeProdutos.put("Camiseta", 20.0);
        mapaDeProdutos.put("Calça Jeans", 40.0);
        mapaDeProdutos.put("Tênis", 50.0);
        mapaDeProdutos.put("Boné", 10.0);
        mapaDeProdutos.put("Meias", 5.0);

        // Imprimir lista de produtos na ordem de inserção
        System.out.println("Lista de Produtos na Ordem de Inserção:");
        for (Map.Entry<String, Double> entrada : mapaDeProdutos.entrySet()) {
            String produto = entrada.getKey();
            Double preco = entrada.getValue();
            System.out.println("Produto: " + produto + ", Preço: " + preco);
        }
    }
}
