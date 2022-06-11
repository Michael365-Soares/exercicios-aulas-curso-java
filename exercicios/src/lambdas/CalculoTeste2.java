package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
   public static void main(String[] args) {
	   
	   //Utilizando a FunctionalInterface BinaryOperator<Integer>
	   BinaryOperator<Integer> calculo=(a,b)->{ return a+b; };
	   System.out.println(calculo.apply(2, 8));
	   calculo=(a,b)-> a*b;
	   System.out.println(calculo.apply(6, 7));
	   
	   System.out.println(Calculo.teste1());
	   Calculo cal=new Somar();
	   cal=(a,b)->a+b;
	   System.out.println();
	   System.out.println(cal.teste());
	   System.out.println(cal.executar(6, 8));
	   cal=(a,b)->5*5;
	   System.out.println(cal.executar(9, 9));
   }
}
