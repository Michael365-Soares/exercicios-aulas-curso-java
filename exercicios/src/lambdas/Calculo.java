package lambdas;

@FunctionalInterface
public interface Calculo {
    public abstract double executar(double a,double b);
    
    default double teste() {
    	return teste1();
    }
    
    static double teste1() {
    	return 2.0;
    }
}
