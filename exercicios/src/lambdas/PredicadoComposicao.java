package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
    	Produto p1=new Produto("Caneta",2.50,0.5);
    	Predicate<Produto> isCaro=prod->prod.getPreco()>=50.0;
    	Predicate<Produto> nome=prod->prod.nome=="Caneta";
    	boolean verificacaoPreco=isCaro.and(nome).negate().test(p1);
    	System.out.println(verificacaoPreco);
    	System.out.println("====================================");
    	Predicate<Integer> parOuImpar=num->num%2==0;
    	Predicate<Integer> digitos=num->num>=100&&num<=999;
    	Predicate<Integer> difere=num->num==555;
    	boolean teste=parOuImpar.and(digitos).or(difere).negate().test(555);
    	boolean teste1=difere.negate().or(digitos).test(555);
    	System.out.println(teste1);
    	System.out.println(teste);
    }
}
