package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	public Data() {
		this(1,1,1970);			
	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
