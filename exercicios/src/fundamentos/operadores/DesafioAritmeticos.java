package fundamentos.operadores;

public class DesafioAritmeticos {
   public static void main(String[] args) {
	   //Resolvendo a primeira Divisão
	   double soma=(3+2);
	   double multiplica=Math.pow((6*soma),2);
	   double dividir=multiplica/(3*2);
	   double divisorResul=dividir;
	   double a=divisorResul;
	   //Resolvendo a segunda divisão
	   double b= Math.pow(((4*-5)/2),2);
	   //Resultado da operação dos dividendos e divisor
	   double resultadoFinal=Math.pow((a-b),3)/Math.pow(10,3);
	   System.out.println("Resultado de A : "+a);
	   System.out.println("Resultado de B: "+b);
	   System.out.println("Resultado final: "+resultadoFinal);
	}
}
