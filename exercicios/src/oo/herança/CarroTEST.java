package oo.herança;

public class CarroTEST {

	public static void main(String[] args) {
		Carro c1 = new Civic(21);
		Ferrari c2 = new Ferrari();
		
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println(c2);
		c2.acelerar();
		c2.ligarTurbo();
		System.out.println(c2);
		
		c2.acelerar();
		c2.ligarTurbo();
		System.out.println(c2);
		
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		

	}

}
