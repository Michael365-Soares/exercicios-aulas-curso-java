package oo.abstrato;

import oo.polimorfismo.Comida;

public class Teste {
    public static void main(String[] args) {
    	Comida racao=new Racao(60.5,"Premium");
    	Animal cachorro=new Cachorro();
    	cachorro.setEspecie("Mamífero");
    	cachorro.comer(racao);
    	System.out.println(cachorro.getPeso());
    	System.out.println(cachorro.respirar());
    }
}
