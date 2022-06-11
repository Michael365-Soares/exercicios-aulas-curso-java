package oo.polimorfismo;

public abstract class Comida {
    protected double calorias;
    public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias += calorias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	protected String nome;
    
   protected Comida(double calorias,String nome) {
    	this.calorias=calorias;
    	this.nome=nome;
    }
}
