package oo.abstrato;
import oo.polimorfismo.Comida;
public class Cachorro extends Mamifero {
	public String emitirSom() {
		return "auauauauauauauau!!!";
	}
	
	public void comer(Comida comida) {
		setPeso(comida.getCalorias());
	}
	
	/*public String locomover() {
		return "Usando as patas";
	}*/
}
