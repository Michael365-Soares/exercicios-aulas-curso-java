package generics;

public class ParesTeste {
    public static void main(String[] args) {
    	Pares<Integer,String> p1=new Pares<>();
    	p1.adicionar(1, "Carro");
    	p1.adicionar(2, "Bicicleta");
    	p1.adicionar(3, "Moto");
    	p1.adicionar(4, "Barco");
    	p1.adicionar(1, "Navio");
    	
    	System.out.println(p1.getValor(1));
    	System.out.println(p1.delete(3));
    	System.out.println(p1.getValor(3));
    	p1.forEach();
    }
}
