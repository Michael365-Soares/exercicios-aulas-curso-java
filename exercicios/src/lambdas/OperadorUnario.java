package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
   public static void main(String[] args) {
	   UnaryOperator<Integer> unario=num->num;
	   UnaryOperator<Integer> unarioSomar=num->num+100;
	   UnaryOperator<Integer> unarioSubtrair=num->num-50;
	   UnaryOperator<Integer> unarioMultiplicar=num->num*50;
	   UnaryOperator<Integer> unarioDividir=num->num/2;
	   int resultado=unario.
			   andThen(unarioSomar)
			   .andThen(unarioSubtrair)
			   .andThen(unarioMultiplicar).
			   andThen(unarioDividir).
			   apply(125);
	   System.out.println(resultado);
	   //Irá fazer o calculo ao contrário antes de executar a primeira função
	   int resultado2=unarioDividir.compose(unarioMultiplicar).compose(unarioSubtrair)
			   .compose(unarioSomar).
			   compose(unario).apply(125);
	   System.out.println(resultado2);

   }
}
