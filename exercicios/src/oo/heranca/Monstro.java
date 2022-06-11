package oo.heranca;

public class Monstro extends Jogador {
     public Monstro(int linha,int coluna,String nome) {
    	 super(linha,coluna,nome);
     }
     
     public Monstro() {
    	 this(0,0,"Demogorgan");    	
     }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
