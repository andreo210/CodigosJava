package fundamentos;

import java.util.Scanner;

public class ComparacaoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		
		System.out.println("2" == s1.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
