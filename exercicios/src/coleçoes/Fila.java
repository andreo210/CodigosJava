package coleçoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();//FILA
		
		//offer e add ==> adiciona elementos na fila
		//a difereça do comportamento ocorre quando a fila esta cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e elemets ==> obter o proximo elemento
		//a difereça do comportamento ocorre quando a fila esta vazia
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.element());
		System.out.println(fila.peek());
		System.out.println(fila.element());

		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.clear();
		//fila.contains(.);
		//fila.size();
		

	}

}
