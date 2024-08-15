package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tipos numerico inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulado = 3_134_845_223L;
		
		//tipos numerico reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = true; //ou false
		
		//tipo caractere
		char status = 'A';//ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagem
		System.out.println(numeroDeVoos / 2);
		
		//ponto por real
		System.out.println(pontosAcumulado / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+salario);
		System.out.println("Ferias ?" +estaDeFerias);
		System.out.println("Status  " +status);
	}

}
