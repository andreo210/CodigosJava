package classe;

public class DataTEST {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		d1.dia = 17;
		d1.mes = 2;
		d1.ano = 1984;
		
		Data d2 = new Data(31, 12, 2020);
		
		d2.imprimirDataFormatada();
		d1.imprimirDataFormatada();

	}

}
