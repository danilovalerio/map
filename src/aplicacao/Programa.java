package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		//Exemplo do uso de Map
		Map <String, String> cookies = new TreeMap<>(); //lembrando que TreeMap retorna ordenado pela chave que é String
		cookies.put("username", "Maria");
		cookies.put("email", "maria@marie.com");
		cookies.put("fone", "987654321");
		
		cookies.remove("email"); //remove de acordo com a chave
		
		cookies.put("fone", "000000000"); //como já tem a chave fone ele só substitui o valor
		
		System.out.println("Todos os cookies:");
		for(String key : cookies.keySet()) { //keySet > retorna um Set com todas as key de um Map
			System.out.println(key + " : "+ cookies.get(key));
		}
		
		
		
	}
	
	
}
