package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
 @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	 /*
	  * A collection do tipo "set" trabalha com conjuntos//por padrão devem ser homogêneos
	  * Não aceita valores do tipo primitivo e valores repetidos
	  * Não é indexado
	  * Possui tamanho indefinido
	  * */
	 HashSet conjunto=new HashSet();
	 conjunto.add(1.2);//Converte automaticamente valores primitivos para seus respectivos wrapers
	 conjunto.add("Michael");
	 conjunto.add(true);
	 conjunto.add(10);
	 conjunto.add('X');
	 conjunto.add("sdffdsfsfs");
	 conjunto.add(true);
	 conjunto.add(2);
	 System.out.println("Tamanho é de: "+conjunto.size());
	 //Removendo elementos
	 System.out.println(conjunto.remove("Michael"));//retorna true ou false de acordo com o resultado
	 System.out.println(conjunto.size());
	 //Verificando se um elemento está contido no HashSet
	 System.out.println(conjunto.contains(10));//verifica se um elemento está contido no conj retornando false/true
	 //Forma de criar um conjunto do tipo set
	 Set nums=new HashSet();
	 nums.add(0);
	 nums.add(1);
	 nums.add(2);
	 nums.add(3);
	 System.out.println(nums);
	 System.out.println("//Fazendo a união entre os conjuntos");
	 conjunto.addAll(nums);
	 System.out.println(conjunto);
	 System.out.println("//Verifica se um conjunto está contido no outro");
	 System.out.println(conjunto.containsAll(nums));
	 System.out.println(conjunto);
	 System.out.println("//Verificando a interseção entre dois conjuntos");
	 //System.out.println(conjunto.retainAll(nums));
	 System.out.println(conjunto);
	 System.out.println("Esvaziando o conjunto");
	 //conjunto.clear();//limpa o conjunto
	 System.out.println(conjunto);
	 conjunto.forEach(ele->System.out.println(ele));
 }
}
