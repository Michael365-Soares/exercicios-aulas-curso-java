package streams.exercitandoreduce;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

interface Utilidades {
     //Criando uma Function<Produto,Double> que ir� receber um Produto e retornar seu pre�o
	 Function<Produto,Double> preco=p->p.preco;
	 //Criando uma BiFunction<Media,Double,Media> que ir� funcionar como um acumulador para o m�todo reduce
	//recebendo uma valor do tipo Double e acumulando em uma vari�vel do tipo Produto e retornando a mesma...
	BiFunction<CarroDeCompra,Double,CarroDeCompra> acumulador=(carro,preco)->carro.adicionar(preco);
	/*Criando um acumulador que ir� ser passado para o m�todo reduce do tipo BiraryOperator<Produto>
	 * que ir� ser respons�vel por receber dois par�metros do tipo Produto e fazer a combina��o aditiva
	 * de seus pre�os e retornar um Produto*/
	BinaryOperator<CarroDeCompra> combinador=(c1,c2)->CarroDeCompra.combinador(c1,c2);
	
}
