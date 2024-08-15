package oo.composição;

public class CompraTEST {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Joao Pedro";
		
		compra1.adicionarItem(new Item("Borracha",12, 3.8));
		compra1.adicionarItem(new Item("Caneta",12, 3.8));
		compra1.adicionarItem(new Item("Lapis",12, 3.8));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obtervALORtOTAL());

	}

}
