package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		List<String> outrasLangs = Arrays.asList("c ", "c++ ", "c# ", "php \n");
		outrasLangs.stream().map(m-> m.toUpperCase()).forEach(print);
		
		System.out.println("usando composição !!!!!!\n ");
		outrasLangs.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.forEach(print);

	}

}
