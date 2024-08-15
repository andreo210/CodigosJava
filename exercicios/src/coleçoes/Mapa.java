package coleçoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");//adiciona elemento
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(2, "Andre"));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);			
		}
		for (String valor : usuarios.values()) {
			System.out.println(valor);			
		}
		
		for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
			Integer key = registro.getKey();
			String val = registro.getValue();
			System.out.println(key);
			System.out.println(val);
			
		}
	}	

}
