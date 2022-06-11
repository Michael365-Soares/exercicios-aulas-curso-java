package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
   //List
   //pode homog�nea ou hetereg�nea
   //Aceita objetos duplicados
   //� ordenada por �ndice
   public static void main(String[] args) {
	   List<Usuario> usuario=new ArrayList<>();
	   Usuario u1=new Usuario("Michael Soares");
	   Usuario u2=new Usuario("Michael");
	   Usuario u3=new Usuario("Ryan");
	   Usuario u4=new Usuario("Ant�nia");
	   List<Usuario> usuario1=new ArrayList<>();
	   Usuario u5=new Usuario("Michael Soares");
	   Usuario u6=new Usuario("Michael");
	   Usuario u7=new Usuario("Ryan");
	   Usuario u8=new Usuario("Ant�nia");
	   //Adicionando elementos
	   usuario.add(u1);
	   usuario.add(u2);
	   usuario.add(u3);
	   usuario.add(u4);
	   usuario.add(new Usuario("Cristiano Ronaldo"));
	   usuario.add(u5);
	   usuario.add(u6);
	   usuario.add(u7);
	   usuario.add(u8);
	   usuario.add(new Usuario("Cristiano Ronaldo"));
	   //Vericando o tamanho da Lista
	   System.out.println(usuario.size());
	   //Verificando se ume elemento est� contido
	   System.out.println(usuario.contains(new Usuario("Michael Soares")));
	   //Adicionando uma lista a outra
	   usuario.addAll(usuario1);
       System.out.println(usuario);
       //Vericando se uma lista est� dentro da outra
       usuario.containsAll(usuario1);
       System.out.println(usuario);
       //Verificando se na lista h� elementos em comum
       //usuario.retainAll(usuario1);
       // System.out.println(usuario);
       //Buscando um elemento pela posi��o 
       System.out.println(usuario.get(0).toString());
       System.out.println(usuario.get(1).nome);
       System.out.println(usuario.remove(4));//se remover pelo ind�ce ir� retornar o elemento removido
       System.out.println(usuario.remove(new Usuario("Michael")));//ir� retornar true/false
   }
}
