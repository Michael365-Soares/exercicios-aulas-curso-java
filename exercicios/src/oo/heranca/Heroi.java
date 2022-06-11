package oo.heranca;

public class Heroi extends Jogador {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Heroi(int linha, int coluna,String nome) {
		super(linha,coluna,nome);
	}
	
	public Heroi() {}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1=super.atacar(oponente);
		boolean ataque2=super.atacar(oponente);
		boolean ataque3=super.atacar(oponente);
		boolean ataque=ataque1||ataque2||ataque3?true:false;
		return ataque ;
	}
	
}
