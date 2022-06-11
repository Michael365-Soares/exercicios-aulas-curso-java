package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Produto p2=new Produto("Canete",2.50,0.5);
	    Produto p3=new Produto("Pincel",2.50,0.5);
	    Produto p4=new Produto("Pincel",2.50,0.5);
	    Produto p5=new Produto("Caderno",2.50,0.5);
	    
	    List<Produto> prod=Arrays.asList(p2,p3,p4,p5);
	    Function<Produto,Double> funcao=produ->produ.getPreco();
	    Function<Double,String> funcao1=preco->"O preço do produto é de: "+preco;
	    Function<String,String> preco=texto->texto+"!!!";
	    String resultado=funcao.andThen(funcao1).andThen(preco).apply(p5);
	    System.out.println(resultado);
	    
	    System.out.println("====================================");
	    
	    Function<Integer,String> parOuImpar=num->num%2==0?"Par":"Ímpar";
	    Function<String,String> txt=texto->"O número é: "+texto;
	    Function<String,String> empolgado=txt1->txt1+"!!!";
	    String result=parOuImpar.andThen(txt)
	    		.andThen(empolgado)
	    		.apply(30);
	    System.out.println(result);
	    
	    System.out.println("===============================================");
	    Function<Produto,Double> vl=valor->valor.getPreco();
	    Function<Double,Double> desconto=valor->valor-(1*0.8);
	    Function<Double,String> tx1=valor->"O preço do produto com desconto é de: "+valor;
	    String precoComDesconto=vl.andThen(desconto).andThen(tx1).apply(p5);
	    System.out.println(precoComDesconto);
	}
      
}
