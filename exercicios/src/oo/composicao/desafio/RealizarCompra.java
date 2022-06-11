package oo.composicao.desafio;

public class RealizarCompra {
	public static void main(String[]args) {
		Produto prod=new Produto("Sabão",8.75,"Limpeza",5);
        Item item=new Item(prod);
        item.produtos.add(new Produto("Arroz",10.55,"Mercearia",3));
        item.produtos.add(new Produto("Feijão",9.66,"Mercearia",6));
        Compra compra=new Compra(item);
        Cliente cliente=new Cliente();
        cliente.adicionarAoCarrinho(compra);
        cliente.visualizarCarrinhoDeCompra();
	}
}
