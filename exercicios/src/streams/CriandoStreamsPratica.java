package streams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreamsPratica {
    public static void main(String[] args) {
    	//Criando um consumer e passando como ref�ncia para o m�todo println do atributo out da classe System
    	System.out.println("//Criando um consumer e passando como ref�ncia para o m�todo println do atributo out da classe System");
    	Consumer<Object> println=System.out::println;
    	//Criando uma Stream pelo m�todo est�tico of()
    	System.out.println("//Criando uma Stream pelo m�todo est�tico of()");
    	Stream<Integer> nums=Stream.of(1,2,3,4,5,5,5,5);
    	nums.forEach(println);
    	//Criando um array e passando ele como par�metro para criar uma Stream
    	System.out.println("//Criando um array e passando ele como par�metro para criar uma Stream");
    	String[] nomes= {"Bia","Tonia","Gui","Didi"};
    	Stream<String> nome=Stream.of(nomes);
    	nome.forEach(println);
    	//Criando uma Stream apartir do m�todo static stream da classe Arrays
    	Arrays.stream(nomes).forEach(System.out::println);
    	System.out.println("//Criando uma Stream apartir do m�todo static stream da classe Arrays");
    	//Selecionando o que deve ser retornado pelo m�todo stream da classe Arrays
    	System.out.println("//Selecionando o que deve ser retornado pelo m�todo stream da classe Arrays");
    	Arrays.stream(nomes,2,4).forEach(System.out::println);
    	//Criando uma Stream utilizando o m�todo static generate que recebe como par�metro um Supllier
    	//Stream.generate(()->"Ol� Mundo!!!");
    	//Criando uma Stream apartir do m�todo static iterate() que recebe  dois um int e um UnaryOperator como par�metro 
    	//Stream.iterate(0,num->num+2);
    	//Criando uma Stream apartir do m�todo stream de uma Collection
    	System.out.println("//Criando uma Stream apartir do m�todo stream de uma Collection");
    	Deque<String> materias=new ArrayDeque<>();
    	materias.add("Matem�tica");
    	materias.add("Portugu�s");
    	materias.add("Ingl�s");
    	materias.add("Estat�stica");
    	materias.stream().forEach(println);
    }
}
