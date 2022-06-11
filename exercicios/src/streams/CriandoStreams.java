package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class CriandoStreams {
    public static void main(String[] args) {
    	//Passando a referência do método System... para um consumer
    	System.out.println("//Passando a referência do método System... para um consumer");
    	Consumer<Object> println=System.out::println;
    	//Criando uma Stream
    	Stream<String> lang=Stream.of("Java","Kotlin","Js");
    	lang.forEach(println);
    	//Criando uma Stream apartir de uma array
    	//String[] maisLangs=new String[10];
    	System.out.println("//Criando uma Stream apartir de uma array");
    	String[] maisLangs= {"HTML","CSS","PHP"};
    	Stream.of(maisLangs).forEach(println);
    	//Criando Stream apartir da classe static Arrays
    	System.out.println("//Criando Stream apartir da classe static Arrays");
    	Arrays.stream(maisLangs).forEach(println);
    	//Selecionado os elementos retornados por meio da classe Arrays pelo método static stream()
    	Arrays.stream(maisLangs,1,2).forEach(println);
    	System.out.println("//Selecionado os elementos retornados por meio da classe Arrays pelo método static stream()");
    	//Criando uma Stream apartir de uma collection
    	System.out.println("//Criando uma Stream apartir de uma collection");
    	Queue<String> nomes=new LinkedList<>();
    	nomes.add("Bia");
    	nomes.add("rafa");
    	nomes.add("leo");
    	nomes.add("gui");
    	nomes.stream();
    	nomes.forEach(println);
    	//Utilizando o método parallelStream()
    	System.out.println("//Utilizando o método parallelStream()");
    	nomes.parallelStream().forEach(println);
    	//Criando uma stream apartir da classe static Stream e seu método generate
    	System.out.println("//Criando uma stream apartir da classe static Stream e seu método generate");
    	//Stream.generate(()->"Olá!!!").forEach(println);
    	//Criando uma Stream apartir do método static iterator da classe Stream
    	System.out.println("//Criando uma Stream apartir do método static iterator da classe Stream");
    	//Stream.iterate(0,(x)->x+1).forEach(println);
    }
}
