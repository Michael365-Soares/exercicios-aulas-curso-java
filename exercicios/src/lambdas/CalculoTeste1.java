package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
    	Calculo cal;
    	cal=new Somar();
    	System.out.println(cal.executar(2, 5));
    	cal= new Multiplicar();
    	System.out.println(cal.executar(5, 2));
    	
    	//Usando lamda por meio de FunctionalInterface
    	Calculo calc=(a,b)->a+b;
    	System.out.println(calc.executar(12, 9));
        calc=(a,b)->{return a-b;};
    	System.out.println(calc.executar(12, 9));
    	calc=(a,b)->a*b;
    	System.out.println(calc.executar(12, 9));
    	calc=(a,b)->a/b;
    	System.out.println(calc.executar(12, 9));
    	calc=(a,b)->a%b;
    	System.out.println(calc.executar(12, 9));
    	
    	cal.teste();
    }
}
