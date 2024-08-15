package fundamentos;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1;//implicita to jogando um inteiro
		System.out.println(a);
		
		float b = (float) 1.12345678888; //explicita não vai caber no float
		System.out.println(b);
		
		int c =340;
		byte d = (byte) c;//explicita(cast)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;//explicita(cast)
		System.out.println(f);

	}

}
