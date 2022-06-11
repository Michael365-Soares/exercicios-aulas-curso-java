package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
   public static void main(String[] args) {
	   //Set<String> cj1=new HashSet<>();**N�O POSSUI ORDENA��O
	   //SortedSet=s�o conjuntos que possuem ordena��o
	   SortedSet<Integer> cj1=new TreeSet<Integer>();//IR� ORDENAR OS ELEMENTOS DO CONJUNTO POR ORDEM DE INSER��O
	   cj1.add(1);
	   cj1.add(2);
	   cj1.add(3);
	   cj1.add(4);
	   cj1.add(5);
	   System.out.println( cj1.contains(5));
	   System.out.println(cj1.remove(4));
	   Set<Integer> cj2=new HashSet<>();
	   cj2.add(6);
	   cj2.add(7);
	   cj2.add(8);
	   //Adiciona um conjunto ao outro
	   cj1.addAll(cj2);
	   //Verifica se um conjunto est� contido no outro
	   cj1.containsAll(cj2);
	   System.out.println(cj1);
	   //Verifica se a interse��o entre os conjuntos
	   cj1.retainAll(cj2);
	   System.out.println(cj1);
	   System.out.println(cj1.size());
	   for(int indice:cj1) {
		   System.out.println(indice);
	   }
   }
}
