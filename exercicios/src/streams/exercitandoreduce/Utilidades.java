package streams.exercitandoreduce;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

interface Utilidades {
     //Criando uma Function<Produto,Double> que irá receber um Produto e retornar seu preço
	 Function<Produto,Double> preco=p->p.preco;
	 //Criando uma BiFunction<Media,Double,Media> que irá funcionar como um acumulador para o método reduce
	//recebendo uma valor do tipo Double e acumulando em uma variável do tipo Produto e retornando a mesma...
	BiFunction<CarroDeCompra,Double,CarroDeCompra> acumulador=(carro,preco)->carro.adicionar(preco);
	/*Criando um acumulador que irá ser passado para o método reduce do tipo BiraryOperator<Produto>
	 * que irá ser responsável por receber dois parâmetros do tipo Produto e fazer a combinação aditiva
	 * de seus preços e retornar um Produto*/
	BinaryOperator<CarroDeCompra> combinador=(c1,c2)->CarroDeCompra.combinador(c1,c2);
	
}
