package streams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreamsPratica {
    public static void main(String[] args) {
    	//Criando um consumer e passando como refência para o método println do atributo out da classe System
    	System.out.println("//Criando um consumer e passando como refência para o método println do atributo out da classe System");
    	Consumer<Object> println=System.out::println;
    	//Criando uma Stream pelo método estático of()
    	System.out.println("//Criando uma Stream pelo método estático of()");
    	Stream<Integer> nums=Stream.of(1,2,3,4,5,5,5,5);
    	nums.forEach(println);
    	//Criando um array e passando ele como parâmetro para criar uma Stream
    	System.out.println("//Criando um array e passando ele como parâmetro para criar uma Stream");
    	String[] nomes= {"Bia","Tonia","Gui","Didi"};
    	Stream<String> nome=Stream.of(nomes);
    	nome.forEach(println);
    	//Criando uma Stream apartir do método static stream da classe Arrays
    	Arrays.stream(nomes).forEach(System.out::println);
    	System.out.println("//Criando uma Stream apartir do método static stream da classe Arrays");
    	//Selecionando o que deve ser retornado pelo método stream da classe Arrays
    	System.out.println("//Selecionando o que deve ser retornado pelo método stream da classe Arrays");
    	Arrays.stream(nomes,2,4).forEach(System.out::println);
    	//Criando uma Stream utilizando o método static generate que recebe como parâmetro um Supllier
    	//Stream.generate(()->"Olá Mundo!!!");
    	//Criando uma Stream apartir do método static iterate() que recebe  dois um int e um UnaryOperator como parâmetro 
    	//Stream.iterate(0,num->num+2);
    	//Criando uma Stream apartir do método stream de uma Collection
    	System.out.println("//Criando uma Stream apartir do método stream de uma Collection");
    	Deque<String> materias=new ArrayDeque<>();
    	materias.add("Matemática");
    	materias.add("Português");
    	materias.add("Inglês");
    	materias.add("Estatística");
    	materias.stream().forEach(println);
    }
}
