package fundamentos;

public class Logicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao1);
		
		System.out.println("tabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		/*
		 * System.out.println(false && true); System.out.println(false && false);
		 */
		
		System.out.println("tabela verdade OU");
		/*
		 * System.out.println(true || true); System.out.println(true || false)
		 */;
		System.out.println(false ||  true);
		System.out.println(false ||  false);
		
		System.out.println("tabela verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^  false);
		System.out.println(false ^  true);
		System.out.println(false ^  false);
		
		System.out.println("tabela verdade NOT");
		System.out.println(true);
		System.out.println(false);
		System.out.println(false ^  true);
		System.out.println(false ^  false);
		

	}

}
