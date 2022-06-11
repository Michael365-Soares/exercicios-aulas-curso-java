package oo.heranca.desafio;

public class Carro {
    protected String modelo;
    final protected int VELOCIDADE_MAXIMA;
    protected int velocidade;
    
    
    public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVELOCIDADE_MAXIMA() {
		return VELOCIDADE_MAXIMA;
	}
	
    Carro(String modelo,int velocidade){
    	this.modelo=modelo;
    	this.VELOCIDADE_MAXIMA=velocidade;
    }
    
    Carro(){
    	this.VELOCIDADE_MAXIMA=280;
    }
    
    public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void acelerar() {
		int delta=VELOCIDADE_MAXIMA;
		if(velocidade>=delta) {
    	    velocidade+=0;
		}else {
			velocidade+=5;
		}
    }
    
    public void frear() {
       if(velocidade>=10) {
    	 velocidade-=10;
       }else {
    	   velocidade=0;
       }
    }
}
