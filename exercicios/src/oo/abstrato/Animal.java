package oo.abstrato;
import oo.polimorfismo.Comida;
public abstract class Animal {
	
    public double getMover() {
		return mover;
	}

	public void setMover(double mover) {
		this.mover = mover;
	}

	protected String nome;
    protected String especie;
    protected double mover;
    protected double peso;
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso += peso;
	}

	public abstract String locomover();
    
    public abstract void comer(Comida comida);
    
    public abstract String emitirSom();
    
    public String respirar() {
    	return "CO2";
    }
    
}
