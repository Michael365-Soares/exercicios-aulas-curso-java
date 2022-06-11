package fundamentos.operadores;

import java.text.DecimalFormat;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
    	var x=8.5;
    	double y=5.5;
    	DecimalFormat format=new DecimalFormat("#.##");
    	System.out.println(format.format(x*y));
    	System.out.println(format.format(x/y));
    	System.out.println(format.format(x+y));
    	System.out.println(format.format(x-y));
    	System.out.println(format.format(x%y));
    }
}
