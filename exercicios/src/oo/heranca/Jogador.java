package oo.heranca;

public class Jogador {
	protected int vida=100;
    protected int linha;//coluna
    protected int coluna;//linha
    protected String nome;
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Jogador(int linha,int coluna,String nome) {
    	this.linha=linha;
    	this.coluna=coluna;
    	this.setNome(nome);
    }
    
    public Jogador() {}
    
    public boolean andar(Direcao direcao) {
	  switch(direcao){
	     case NORTE:
	    	 coluna--;
	    	 break;
	     case LESTE:
	    	 linha++;
	    	 break;
	     case SUL:
	    	 coluna--;
	     case OESTE:
	    	 linha--;
	     break;
	     default:
	    	 System.out.println("Direção inválida!");
	  }
    	return true;
    }
    
    public boolean atacar(Jogador oponente) {
    	int deltaLinha=Math.abs(linha-oponente.linha);
    	int deltaColuna=Math.abs(coluna-oponente.coluna);
    	if(deltaLinha==0&&deltaColuna==1) {
    		oponente.vida-=10;
    		return true;
    	}else if(deltaLinha==1&&deltaColuna==0) {
    		oponente.vida-=10;
    		return true;
    	}
    	return false;
    }
    
}
