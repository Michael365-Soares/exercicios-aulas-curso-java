package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    List<Produto> produtos=new ArrayList<>();
    Compra compra;
	public Item(Produto prod) {
		this.produtos.add(prod);
		prod.item=this;
	}
}
