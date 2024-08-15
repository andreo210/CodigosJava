package classe;

public class ProdutoComMetodoTest {

	public static void main(String[] args) {
		ProdutoComMetodo p1 = new ProdutoComMetodo();
		p1.nome = "notebook";
		p1.preco = 5000.00;
		p1.desconto = 300.00;
		
		var p2 = new ProdutoComMetodo();
		p2.nome = "celular";
		p2.preco = 4800.00;
		p2.desconto = 800.00;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComdesconto();
		double precoFinal2 = p2.precoComdesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	}

}
