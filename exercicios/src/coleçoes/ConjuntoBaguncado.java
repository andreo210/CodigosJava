package coleçoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
		HashSet conjunto = new HashSet();//CONJUNTO
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("tamanho é : "+conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("tamanho é : "+conjunto.size());
		
		System.out.println("tamanho é : "+conjunto.remove("teste"));
		System.out.println("tamanho é : "+conjunto.remove("Teste"));
		System.out.println("tamanho é : "+conjunto.remove('x'));
		
		System.out.println("tamanho é : "+conjunto.size());
		
		System.out.println("tamanho é : "+conjunto.contains("teste"));
		System.out.println("tamanho é : "+conjunto.contains(1));
		System.out.println("tamanho é : "+conjunto.contains(true));
		
		
		

	}

}
