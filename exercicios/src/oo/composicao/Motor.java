package oo.composicao;

public class Motor {
    double	fatorInjecao=1;
    boolean ligado=false;
    final Carro carro;
    public Motor(Carro carro) {
    	this.carro=carro;
    }
    public int giros() {
    	if(ligado){ 
    		return (int)Math.round(this.fatorInjecao*3000);
    	}else{
    		return 0;
    	}
    }
}
