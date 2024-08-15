package excecao;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException  extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("o atributo %s esta negativo ", nomeDoAtributo);
	}
}
