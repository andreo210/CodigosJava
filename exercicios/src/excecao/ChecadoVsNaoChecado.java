package excecao;

public class ChecadoVsNaoChecado {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	//exceção não checado
	static void geraErro1()
	{
		throw new RuntimeException("Ocorreu um erro 01 ");
	}
	
	//exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro 02 ");
	}
}
