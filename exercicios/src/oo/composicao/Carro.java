package oo.composicao;

public class Carro implements Exportivo {
    final Motor motor;
    int velocidade;
    Carro(){
    	this.motor=new Motor(this);
    }
    public void acelerar(int velocidade) {
    	if(motor.ligado) {
    	   this.velocidade=velocidade;
    	   motor.fatorInjecao+=this.velocidade;
    	}else {
    		System.out.println("Ligue o carro!");
    	}
    }
    
    public boolean ligar() {
    	return motor.ligado=true;
    }
    
    public boolean desligar() {
    	return motor.ligado=false;
    }
    
    public void frear() {
    	motor.fatorInjecao-=motor.fatorInjecao;
    }
    
    public void ligarTurbo() {
    	this.velocidade+=20;
    }
    
    public void desligarTurbo() {
    	this.velocidade-=20;
    }
}
