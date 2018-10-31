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
		//remove de acordo com a chave
		cookies.remove("email");
		System.out.println("Chave email foi removida");
		
		//como já tem a chave fone ele só substitui o valor
		cookies.put("fone", "901001001");
		
		//verifica se existe a chave 'fone'
		System.out.println("Contém a chave 'fone': "+ cookies.containsKey("fone"));
		
		//pegando o valor de uma chave
		System.out.println("Telefone: "+cookies.get("fone"));
		
		//solicitando uma chave que não existe
		System.out.println("Email: "+ cookies.get("email"));
		
		//verificando o tamanho do Map
		System.out.println("Tam. do Map: "+ cookies.size());
				
		System.out.println("Todos os cookies:");
		//keySet > retorna um Set com todas as key de um Map e pega a chave com o .get(key)
		for(String key : cookies.keySet()) { 
			System.out.println(key + " : "+ cookies.get(key));
		}
		
		
		
		
		
	}
	
	
}
