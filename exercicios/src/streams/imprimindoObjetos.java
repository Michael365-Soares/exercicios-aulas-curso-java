package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class imprimindoObjetos {
    public static void main(String[] args) {
    	List<String> lista=Arrays.asList("Michael","Antônia","BIa","Rafa","Biel");
    	//Percorrendo uma lista de diferentes formas
    	//Usando laço for
    	System.out.println("##Usando laço for");
    	for(int i=0;i<lista.size();i++) {
    	     System.out.println("Nome: "+lista.get(i));	
    	}
    	//Usando While
    	System.out.println("##Usando While");
    	int i=0;
    	int j=lista.size();
    	while(i<=j-1) {
    		 System.out.println("Nome: "+lista.get(i));	
    		 i++;
    	}
    	//Usando forEach
    	System.out.println("##Usando forEach");
    	for(String alunos:lista) {
    		System.out.println(alunos);
    	}
    	//Usando lambda expression
    	System.out.println("##Usando lambda expression");
    	lista.forEach(aluno->System.out.println(aluno));
    	//Usando Method Reference
    	System.out.println("##Usando Method Reference");
    	lista.forEach(System.out::println);
    	
    	System.out.println("Utilizando a interface Iterator");
    	Consumer<String> println=System.out::println;
    	Iterator<String> iterator=lista.iterator();
    	//hasNext() método da interface Iterator responsável por verificar se há um próximo elemento na lista
        while(iterator.hasNext()) {
        	List<String> x=Arrays.asList(iterator.next());
        	x.forEach(println);
        }
    	System.out.println("Utilizando a interface Stream");
    	Stream<String> stream=lista.stream();
    	stream.forEach(println);
    }
}
