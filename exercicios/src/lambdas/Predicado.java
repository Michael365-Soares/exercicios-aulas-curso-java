package lambdas;
import java.util.function.Predicate;
public class Predicado {
   public static void main(String[] args) {
	   Produto prod1=new Produto("Camiseta",50.0,0.25);
	   Predicate<Produto> isCaro=(prod)->{boolean a=prod.getPreco()*(1-prod.desconto)>=30.0?true:false; return a;};
	   System.out.println(isCaro.test(prod1));
   }
}
