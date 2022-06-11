package oo.composicao;

import java.util.Objects;

public class Produto {
	
    @Override
	public int hashCode() {
		return Objects.hash(nome, preco, quantidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& quantidade == other.quantidade;
	}
	Compra compra;
	String nome;
    double preco;
    int quantidade;
    Produto(String nome,double preco,int qtd){
    	this.nome=nome;
    	this.preco=preco;
    	this.quantidade=qtd;
    }
    Produto(){}
}
