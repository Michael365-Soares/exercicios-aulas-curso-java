package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class OperadorBinario {
     public static void main(String[] args) {
    	 BinaryOperator<Double> media=(a,b)->(a+b)/2;
    	 Function<Double,Double> dividir=num->num/2;
    	 Predicate<Double> modulo=num->num%2==0;
    	 /*Function<Boolean,String> resposta=num->"O números passados mulplicados "
    	 		+ "entre eles e divido por dois geram um número par...";
    	 System.out.println(media.apply(8.9,9.5));*/
    	 
    	 BiFunction<Double,Double,String> aprovado=(n1,n2)->(n1+n2)/2>=7.0?"Aluno Aprovado":"Aluno Reprovado";
    	 System.out.println(aprovado.apply(5.7, 8.9));
    	 
    	 Function<Double,String> conceito=nota->nota>=7.0?"Aluno aprovado!":"Aluno reprovado";
    	 
    	 String resultado=media.andThen(conceito).apply(10.0,5.6);
    	 System.out.println("****"+resultado);
     }
}
