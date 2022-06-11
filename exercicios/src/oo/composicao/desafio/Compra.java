package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens=new ArrayList<>();
	Cliente cliente;
	public Compra(Item item) {
		this.itens.add(item);
		item.compra=this;
	}
}
