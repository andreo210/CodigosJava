package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		//binaryOperator
		BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2;
		System.out.println(media.apply(9.8, 5.7));
		
		//cpm bi function
		BiFunction<Double, Double, String> resultado = (n1,n2) -> {
			double notaFinal = (n1+n2)/2;
			return notaFinal >= 7 ? "aprovado ": "reprovado";
		};
		System.out.println(resultado.apply(9.7, 5.2));
		
		//com function
		Function<Double, String> conceito = m -> m>=7 ? "aprovado": "reprovado";		
		System.out.println(media.andThen(conceito).apply(6.9, 5.0));
		

	}

}
