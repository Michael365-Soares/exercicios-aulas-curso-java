package streams.exercitandoreduce;

import java.util.Arrays;
import java.util.List;

public class Reduce1 {
   public static void main(String[] args) {
	   
	  //Criando instâncias do objeto Produto para criar uma List<Produto>
	  Produto p1=new Produto("Caneta",2.50,0.2);
	  Produto p2=new Produto("Lápis",5.50,0.2);
	  Produto p3=new Produto("Borracha",9.50,0.2);
	  Produto p4=new Produto("Apontador",1.50,0.2);
	  Produto p5=new Produto("Lapiseira",6.50,0.2);
	  Produto p6=new Produto("Canetão",3.50,0.2);
	  Produto p7=new Produto("Cola",11.00,0.2);
	  //Criando um List<Produto>
	  List<Produto> listaProdutos=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	  //Intanciando um objeto do tipo CarroDeCompra para receber o retorno da pipeline
	  CarroDeCompra c=new CarroDeCompra();
	  /*Pipeline responsável por utilizar uma Function<Produto,Double> de nome preco que recebe um produto como parâmetro
	   * e retorna uma Stream de valores do tipo Double, que são passados para uma function do tipo BiFunction<CarroDeCompra,Double,CarroDeCompra> 
	   * acumulador,
	   * a qual é responsável por receber um parâmetro do tipo Double e ir acumulando no atributo precoTotal de um objeto do tipo
	   * CarroDeCompra, o mesmo retorna um objeto(CarroDeCompra) e passa o mesmo para outra function do tipo BinaryOperator<CarroDeCompra> combinador
	   * que é responsável por receber dois parâmetros do tipo(CarroDeCompra) fazer a junção de seu atributos precoTotal em outro objeto
	   * do tipo carroDeCompra e retorna o mesmo, assim passando essas duas functions para o método reduce..... */
	  c=listaProdutos.stream().map(Utilidades.preco).reduce(new CarroDeCompra(),Utilidades.acumulador,Utilidades.combinador);
	  
	  System.out.println(c.getTotal());
	  System.out.println(c.mediaGasto());
	  
   }
}
