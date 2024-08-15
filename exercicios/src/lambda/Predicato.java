package lambda;

import java.util.function.Predicate;

public class Predicato {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco* (1 -prod.desconto)) >= 750;
		Produto produto = new Produto("notebook", 3853.00, 0.15);
		System.out.println(isCaro.test(produto));
	}

}
