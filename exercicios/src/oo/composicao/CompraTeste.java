package oo.composicao;

public class CompraTeste {
   public static void main(String[] args) {
	   Compra c1=new Compra();
	   c1.adicionarNoCarrinho(new Produto("Lápis",1.50,10));
	   c1.adicionarNoCarrinho(new Produto("Caneta",2.00,10));
	   Produto p1=new Produto("Lapiseira",3.00,5);
	   c1.adicionarNoCarrinho(p1);
	   c1.carrinhoDeCompra.put("Caneta",new Produto("Caneta",2.00,10));
	   c1.visualizarItensComprados();
	   System.out.println(c1.carrinhoDeCompra.containsValue(p1));   
	 }
}
