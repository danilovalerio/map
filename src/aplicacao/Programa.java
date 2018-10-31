package aplicacao;

import java.util.HashMap;
import java.util.Map;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		//Segundo exmeplo com outros objetos e tipos
		Map<Produto, Double> stock = new HashMap<>();
		
		Produto p1 = new Produto("Tv", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		//Criada a nova instancia do produto
		Produto ps = new Produto("Tv", 900.0);
		
		//Mesmo sendo instância diferente, como os itens são iguais
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
