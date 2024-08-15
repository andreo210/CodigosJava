package coleçoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque <String> livro = new ArrayDeque<String>();
		livro.add("O pequeno principe");
		livro.push("Don Quixote");
		livro.push("O Hobbit");
		
		
		//peek e elemets ==> obter o proximo elemento
		//a difereça do comportamento ocorre quando a fila esta vazia
		System.out.println(livro.peek());//retorna null
		System.out.println(livro.element());
		System.out.println(livro.peek());
		System.out.println(livro.element());

		System.out.println(livro.poll());//retorna null
		System.out.println(livro.remove());//lança uma exceção
		System.out.println(livro.poll());
		System.out.println(livro.poll());
		System.out.println(livro.poll());
		
		//fila.clear();
		//fila.contains(.);
		//fila.size();
		for (String string : livro) {
			System.out.println(string);
		}
		
	}
	

}
