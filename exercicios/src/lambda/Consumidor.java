package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p-> System.out.println(p.nome+ "!!!!");
		
		Produto p1 = new Produto("caneta",13.24, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("notebook",13.24, 0.09);
		Produto p3 = new Produto("caderno",13.24, 0.09);
		Produto p4 = new Produto("borracha",13.24, 0.09);
		Produto p5 = new Produto("lapis",13.24, 0.09);
		
		List<Produto> produtos =  Arrays.asList(p1,p2,p3,p4,p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p-> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
