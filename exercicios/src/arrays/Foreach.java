package arrays;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notas = {6.9, 8.9, 5.5, 10};	
		
		for (int i = 0; i < notas.length; i++) {
				System.out.println(notas[i] + " ");
		}
		
		System.out.println();
		
		for (double d : notas) {
			System.out.println(d + " ");
		}
		
		}

	

}
