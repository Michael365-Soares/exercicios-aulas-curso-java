package lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Foreach {
    public static void main(String[] args) {
    	List<String> aprovados=Arrays.asList("Ana","Bia","Lia","Gui");
    	
    	System.out.println("Forma tradicional de percorrer uma lista");
    	for(String nome: aprovados) {
    		System.out.println(nome);
    	}
    	
    	System.out.println("\nLambda #01");
    	aprovados.forEach((nome)->{
    		System.out.println(nome);
    	});
    	
    	System.out.println("\nMethod Reference...");
    	aprovados.forEach(System.out::println);
    	
    	Map<Integer,String> alunos=new HashMap<>();
    	alunos.put(1,"Michael");
    	alunos.put(2,"Rafa");
    	alunos.put(3,"Bia");
    	alunos.put(4,"Daniel");
    	
    	System.out.println("Forma tradicional de percorrer um mapa");
    	for(Entry<Integer,String> alunos1: alunos.entrySet()) {
    		System.out.println(alunos1.getKey());
    		System.out.println(alunos1.getValue());
    	}
    	
    	System.out.println("\nLambda #01");
    	alunos.keySet().forEach(nome->System.out.println(nome));
    	System.out.println("########");
    	alunos.entrySet().forEach(System.out::println);
    	System.out.println("\nMethod Reference...");
    	alunos.values().forEach(System.out::println);
    	
    	System.out.println("utilizando o méthod reference meuImprimir criado");
    	System.out.println("Lambda #02");
    	aprovados.forEach((nome)->meuImprimir(nome));
    	System.out.println("=====================================");
    	alunos.values().forEach((nome)->meuImprimir(nome));
    	System.out.println("Method reference #02");
    	aprovados.forEach(Foreach::meuImprimir);
    	System.out.println("=====================================");
    	alunos.values().forEach(Foreach::meuImprimir);
    }
    
    static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é "+ nome);
	}
}
