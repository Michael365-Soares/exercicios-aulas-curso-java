package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
   public static void main(String[] args) {
	 Queue<String> fila=new LinkedList<>();
	 fila.add("Michael Soares");
	 fila.add("Michael");
	 fila.add("Ryan");
	 fila.add("Zeze");//Se a fila tiver tamanho determinado e esse estourar irá ser lançado uma exception
	 fila.offer("João");//retorna true/false caso seja uma fila que tenha restrição de tamanho se o elemento for ou não add
	 //Tamanho da fila
	 System.out.println(fila.size());
	 //Percorrendo elementos da fila
	 for(String elemento:fila) {
		 System.out.println(elemento);
	 }
	 //Pegar elementos da fila
	 System.out.println(fila.peek());//irá retornar o primeiro elemento da fila sem remove-lo/retorna null se fila vazia
	 System.out.println(fila.poll());//irá retornar o primeiro elementoo e remove-lo/retorna null se fila vazia
	 System.out.println(fila.remove());//irá lançar uma exception se fila estiver vazia
	 System.out.println(fila.element());//irá fazer a mesmo coisa que peek()/irá lançar uma exception se fila vazia
	 //Limpar fila
	   //fila.clear();
	 //Verificar um elemento está contido
	 System.out.println(fila.contains("Michael"));
	 //Verificar se a fila está ou não vazia
	 System.out.println(fila.isEmpty());
   }
}
