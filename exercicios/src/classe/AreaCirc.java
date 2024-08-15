package classe;

public class AreaCirc {
	
	double raio ;
	final static double PI = 3.1415;

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
		// TODO Auto-generated constructor stub
	}
	
	double area () {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	

}
