package lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
			UnaryOperator<Integer>maisDois = n-> n +2;
			UnaryOperator<Integer>vezesDois = n-> n*2;
			UnaryOperator<Integer>aoQuuadrado = n-> n*n;
			
			int resultado1 = maisDois
					.andThen(vezesDois)
					.andThen(aoQuuadrado)
					.apply(0);
			System.out.println(resultado1);
			
			int resultado2 = aoQuuadrado
					.compose(vezesDois)
					.compose(maisDois)
					.apply(0);
			System.out.println(resultado2);

	}

}
