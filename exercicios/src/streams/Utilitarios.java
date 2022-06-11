package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public interface Utilitarios {
	  //Criando Lambdas expression e armazenando-as em uma variável para uso posterior
	  public static final UnaryOperator<String> maiuscula=txt->txt.toUpperCase();
	  public static final UnaryOperator<String> primeiraLetra=txt->txt.charAt(0)+"";
	  public static final UnaryOperator<String> grito=txt->txt+"!!!";
	  //Criando uma lambda function que recebe um inteiro e retorna o mesmo em formato de String
	  public static final Function<Integer,String> conversorDeInteiros=(num)->{ return num.toBinaryString(num);};
	  //Criando uma function UnaryOperator que recebe uma String e a retorna ao inverso
	  public static final Function<String,String> inversorDeString=txt-> new StringBuilder(txt).reverse().toString();
	  //Criando uma lambda Function que recebe uma String e converte para inteiro
	  public static final Function<String,String> conversorStringInteger=txt->{
		      return Integer.parseInt(txt,2)+"-";
		  };
	  public static String grito(String n) {
		 return n+"!!!"; 
	  } 
}
