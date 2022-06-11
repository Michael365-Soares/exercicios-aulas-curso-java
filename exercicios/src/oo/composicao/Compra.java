package oo.composicao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Compra {
    int qtdProdutos;
    Map<String,Produto> carrinhoDeCompra=new HashMap<>();
    public void adicionarNoCarrinho(Produto prod) {
    	carrinhoDeCompra.put(prod.nome,prod);
    	prod.compra=this;
    }
    
    public void visualizarItensComprados() {
    	double total=0;
    	for(Entry<String,Produto> prod:carrinhoDeCompra.entrySet()) {
    		   System.out.println("Produto: "+prod.getKey());
    		   System.out.println("Preço: R$"+prod.getValue().preco);
    		   System.out.println("Quantidade: "+prod.getValue().quantidade);
    		   System.out.println("Subtotal: "+(prod.getValue().preco*prod.getValue().quantidade));
    		   total+=(prod.getValue().preco*prod.getValue().quantidade);
    		   System.out.println("====================================");
        }
    	System.out.println("Total: R$ "+total);
    }
}
