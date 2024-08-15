package lambda;

import java.util.function.BinaryOperator;

public class CalculoTEST2 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x , y) -> {return x + y;};//função lambda
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x , y) -> x* y;// função lambda
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x , y) -> {return x + y;};//função lambda
		System.out.println(calc2.apply(2, 3));
		
		calc = (x , y) -> x* y;// função lambda
		System.out.println(calc2.apply(2, 3));
	}

}
