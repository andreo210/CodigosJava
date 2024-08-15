package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		externo : for(int a = 0; a <=10; a ++) {
			
			 for (int i =0; i <=10;i++) {
				if (a == 1) {
					break externo;
				}
				System.out.printf("[%d %d]", a, i);
				
			}
			System.out.println();	
		}
		System.out.println("F I M");	
	}

}
