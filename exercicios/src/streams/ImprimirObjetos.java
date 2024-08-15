package streams;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucas", "Ana");
		
		System.out.println("\n Usando foreach....");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Usando Iterator....");
		Iterator<String> iteraror = aprovados.iterator();
		while (iteraror.hasNext()) { //enquanto tem proximo
			System.out.println(iteraror.next());			
		}
		
		System.out.println("\n Usando Stream....");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);//laço interno
	}

}
