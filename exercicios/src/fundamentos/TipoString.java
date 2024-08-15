package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		
		String result = String.format("Hoje nós processamos %,d transações", 100000);
        System.out.println(result);
		
		System.out.println("frase qualquer ".contains("qual"));
		System.out.println("frase qualquer ".indexOf("qual"));
		System.out.println("frase qualquer ".substring(6));
		System.out.println("frase qualquer ".substring(6,10));
		
		
		

	}

}
