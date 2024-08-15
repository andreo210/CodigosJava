package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriadoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "lua ","JS  \n" );
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go \n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);//imprimi dentro do intervalo
		
		List<String> outrasLangs = Arrays.asList("C ", "C++ ", "C# ", "PHP \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n+1).forEach(println);
		


	}

}
