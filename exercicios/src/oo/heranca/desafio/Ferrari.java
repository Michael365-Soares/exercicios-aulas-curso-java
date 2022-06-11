package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo,Luxo {
	
	protected boolean arCondicionado;
	public Ferrari(String modelo,int velocidade) {
		super(modelo,velocidade);
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		this.velocidade+=5;
		super.acelerar();	
	}
	
	public void ligarTurbo() {
		this.velocidade+=15;
	};
	
	public void desligarTurbo() {
		this.velocidade-=5;
	};
	
	public void ligarArCondicionado() {
		this.arCondicionado=true;
	}
	
	public void desligarArCondicionado() {
		this.arCondicionado=false;
	}
	
}
