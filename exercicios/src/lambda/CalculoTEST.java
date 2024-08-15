package lambda;

public class CalculoTEST {

	public static void main(String[] args) {
		Calculo calc = (x , y) -> {return x + y;};//função lambda
		System.out.println(calc.executar(2, 3));
		
		calc = (x , y) -> x* y;// função lambda
		System.out.println(calc.executar(2, 3));

 }
}
