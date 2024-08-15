package fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Bom dia X";
		s =s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat(" !!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x"
				.replace("x", "Andre")
				.toUpperCase();
		System.out.println(y);
		
		

	}

}
