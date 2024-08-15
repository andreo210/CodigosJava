package coleçoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();//LISTA
		
		Usuario u1 = new Usuario(" Andre");
		lista.add(u1);
		
		lista.add(new Usuario("carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(0));//acessar pelo indice
		
		System.out.println(">>>>>>"+ lista.remove(1));
		System.out.println(lista.remove(new Usuario("Andre")));
		
		System.out.println("tem ?"+lista.contains(new Usuario("Lia")));
		System.out.println("tem ?"+lista.contains(u1));
		
		for ( Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		

	}

}
