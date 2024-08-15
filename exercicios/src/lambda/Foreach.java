package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	static void meuImprimir(String nome) {
		System.out.println("oi meu nome é "+ nome);
	}
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma tradicional");
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}		
		//lambda
		System.out.println("\n lambda 01");
		aprovados.forEach(nome -> System.out.println(nome + "!!!!!"));
		
		System.out.println("\n lambda 02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		//método reference		
		System.out.println("\n Method Reference 01");
		aprovados.forEach(System.out ::println);
		
		System.out.println("\n Method Reference 02");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
}
