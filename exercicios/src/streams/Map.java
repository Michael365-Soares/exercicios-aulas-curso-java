package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {
   public static void main(String[] args) {
	   //Criando um consumer do tipo string que ir� fazer refer�ncia para o m�todo System.out.println
	   Consumer<String> println=System.out::println;
	   //Criando uma stream apartir do m�todo static of() da  interface Stream
	   Stream<String> prod=Stream.of("Caneta","L�pis","BOrracha","Caderno","Cola");
	   //Gerando uma stream com filtro apartir do m�todo map() da interface Stream
	   Stream<String> filtro01=prod.map(nome->nome.substring(0,3));
	   //Retornando o resultado do filtro passado para o m�todo map
	   filtro01.forEach(println);
	   //Exerc�cio da aula
	   //Criando um collection do tipo List
	   List<String> marcas=Arrays.asList("bmw","audy","honda");
	   //Criando uma stream apartir da collection marcas e transformando todos os nomes para caixa alta e imprimindo 
	 //Criando Lambdas expression e armazenando-as em uma vari�vel para uso posterior
		  //UnaryOperator<String> maiuscula=txt->txt.toUpperCase();
		  //UnaryOperator<String> primeiraLetra=txt->txt.charAt(0)+"";
		  //UnaryOperator<String> grito=txt->txt+"!!!";
	   System.out.println("//Criando uma stream apartir da collection marcas e usando o m�todo map criar uma segunda"
	   		+ "Stream com todos os elementos da List em caixa alta:");
	   marcas.stream().map(marca->marca.toUpperCase()).forEach(println);
	   System.out.println("Usando composi��o apartir do m�todo static map() da classe stream");
	   marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(println);
   }
}
