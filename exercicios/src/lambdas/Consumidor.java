package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		Produto p1=new Produto("Maça",2.50,0.5);
	    Consumer<Produto> imprimir=prod->System.out.println(prod.nome);
	    imprimir.accept(p1);
	    Produto p2=new Produto("Canete",2.50,0.5);
	    Produto p3=new Produto("Pincel",2.50,0.5);
	    Produto p4=new Produto("Pincel",2.50,0.5);
	    Produto p5=new Produto("Caderno",2.50,0.5);
	    List<Produto> carrinho=Arrays.asList(p1,p2,p3,p4,p5);
	    System.out.println("Utilizando lambda para percorrer uma lista:");
	    carrinho.forEach(imprimir);
	    System.out.println("Utilizando method reference para percorrer uma lista:");
	    carrinho.forEach(prod->myImprimir(prod));
	    System.out.println("============================================");
	    carrinho.forEach(Consumidor::myImprimir);
	}
	
	static void myImprimir(Produto prod) {
		System.out.println(prod.toString());
	}
}
