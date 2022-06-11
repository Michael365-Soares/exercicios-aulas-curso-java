package oo.composicao.desafio;

public class Produto {
   String nome;
   double preco;
   String classeProduto;
   int quantidade;
   Item item;
   Produto(String nome,double preco,String classeProduto,int quantidade){
	   this.nome=nome;
	   this.preco=preco;
	   this.classeProduto=classeProduto;
	   this.quantidade=quantidade;
   }
}
