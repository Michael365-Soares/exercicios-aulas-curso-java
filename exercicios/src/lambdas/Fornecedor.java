package lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fornecedor {
   public static void main(String[] args) {
	   Supplier<List<String>> umaLista=()-> Arrays.asList("Ana","Bia","Gui");
	   System.out.println(umaLista.get());
	   /*A função Supplier irá retorna uma function*/
	   Supplier<Function<Integer,String>> umaFunction=()->numero->"O número passado foi "+numero;
	   Function<Integer,String> func=umaFunction.get();
	   String mostrar=func.apply(55);
	   System.out.println(mostrar);
	   //Retornando uma Predicate por meio de um Supplier
	   Supplier<Predicate<Integer>> predicado=()->numero->numero==55;
	   Supplier<Predicate<Integer>> predicado1=()->numero->numero%55==0;
	   Supplier<Predicate<Integer>> predicado2=()->numero->numero%100==0;
	   Predicate<Integer> test0=predicado.get();
	   Predicate<Integer> tes1=predicado1.get();
	   Predicate<Integer> tes2=predicado2.get();
	   System.out.println(test0.and(tes1).and(tes2).test(555));
	   //Testando Supplier retornando Functions
	   Supplier<Function<Integer,Integer>> myFunction0=()->numero->numero;
	   Supplier<Function<Integer,Integer>> myFunction1=()->numero->numero+10;
	   Supplier<Function<Integer,Integer>> myFunction2=()->numero->numero-100;
	   Supplier<Function<Integer,Integer>> myFunction3=()->numero->numero*10;
	   Supplier<Function<Integer,Integer>> myFunction4=()->numero->numero/1000;
	   Function<Integer,Integer> teste1=myFunction0.get();
	   Function<Integer,Integer> teste2=myFunction1.get();
	   Function<Integer,Integer> teste3=myFunction2.get();
	   Function<Integer,Integer> teste4=myFunction3.get();
	   Function<Integer,Integer> teste5=myFunction4.get();
	   int resultado=teste1.andThen(teste2).andThen(teste3).andThen(teste4).andThen(teste5).apply(1500);
	   System.out.println(resultado);
	   Supplier<BinaryOperator<Integer>> soma=()->(n1,n2)->n1+n2;
	   BinaryOperator<Integer> somar=soma.get();
	   System.out.println(somar.apply(25,25));
   }
}
