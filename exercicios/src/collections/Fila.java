package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
   public static void main(String[] args) {
	 Queue<String> fila=new LinkedList<>();
	 fila.add("Michael Soares");
	 fila.add("Michael");
	 fila.add("Ryan");
	 fila.add("Zeze");//Se a fila tiver tamanho determinado e esse estourar ir� ser lan�ado uma exception
	 fila.offer("Jo�o");//retorna true/false caso seja uma fila que tenha restri��o de tamanho se o elemento for ou n�o add
	 //Tamanho da fila
	 System.out.println(fila.size());
	 //Percorrendo elementos da fila
	 for(String elemento:fila) {
		 System.out.println(elemento);
	 }
	 //Pegar elementos da fila
	 System.out.println(fila.peek());//ir� retornar o primeiro elemento da fila sem remove-lo/retorna null se fila vazia
	 System.out.println(fila.poll());//ir� retornar o primeiro elementoo e remove-lo/retorna null se fila vazia
	 System.out.println(fila.remove());//ir� lan�ar uma exception se fila estiver vazia
	 System.out.println(fila.element());//ir� fazer a mesmo coisa que peek()/ir� lan�ar uma exception se fila vazia
	 //Limpar fila
	   //fila.clear();
	 //Verificar um elemento est� contido
	 System.out.println(fila.contains("Michael"));
	 //Verificar se a fila est� ou n�o vazia
	 System.out.println(fila.isEmpty());
   }
}
