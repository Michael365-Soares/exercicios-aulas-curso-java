package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
   public static void main(String[] args) {
	  Deque<String> pilha=new ArrayDeque<>();
	  //Add elementos
	  pilha.push("HARRY POTEER");
	  pilha.push("Matrix");
	  pilha.push("Matrix Evolution");
	  pilha.push("Veloses e Furiosos");//retorna uma exception se não adicionado
	  pilha.add("Veloses e Furiosos");//retorna false/true se não adicionado
	  //Pegando elementos
	  System.out.println(pilha.peek());//pega e não remove o elemento/retorna null se pilha vazia
	  System.out.println(pilha.element());//pega e não remove/estoura exception se vazia
	  //Remove elementos
	  //System.out.println(pilha.poll());//pega e remove/retorna null se fila vazia
	 // System.out.println(pilha.remove());//pega e remove/estoura exception se fila vazia
	// System.out.println(pilha.pop());//retorna uma exception caso pilha vazia
	 for(String filmes:pilha) {
		 System.out.println(filmes);
	 }
	 System.out.println("Usando Lambda");
	 pilha.forEach((elemento)->System.out.println(elemento));
   }
}
