package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
   public String nome;
   List<Compra> compras=new ArrayList<>();
   Compra compra;
   public void adicionarAoCarrinho(Compra compra) {
	   this.compras.add(compra);
	   compra.cliente=this;
   }
   
   public void visualizarCarrinhoDeCompra() {
	   for(Compra compra: compras) {
		   double total=0;
		   for(Item itens:compra.itens) {
			   for(Produto prod:itens.produtos) {
				   System.out.println("Produto: "+prod.nome);
				   System.out.println("Preço: "+prod.preco);
				   System.out.println("Produto: "+prod.classeProduto);
				   System.out.println("Qunatidade: "+prod.quantidade);
				   double subTotal=(prod.quantidade*prod.preco);
				   System.out.printf("SubTotal: %.2f\n",(float)subTotal);
				   System.out.println("=========================================");
				   total+=subTotal;
			   }
		   }
		   System.out.printf("Valor Total:R$ %.2f ",total);
	   }
   }
}
