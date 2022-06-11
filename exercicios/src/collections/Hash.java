package collections;

import java.util.HashSet;
import java.util.Set;

public class Hash {
	public static void main(String[]args) {
		Set<Usuario> usuario=new HashSet<>();
		Usuario u1=new Usuario("Michael");
		Usuario u2=new Usuario("Antonia");
		Usuario u3=new Usuario("Joao");
		Usuario u4=new Usuario("Maria");
		usuario.add(u1);
		usuario.add(u2);
		usuario.add(u3);
		usuario.add(u4);
		boolean resultado=usuario.contains(new Usuario("Michael"));
		System.out.println(resultado);
		//Percorrendo a collection
		//Foreach
		System.out.println("FOREACH TRADICIONAL");
		for(Usuario usuarios:usuario) {
			System.out.println(usuarios);
		}
		//Lambda
		System.out.println("USANDO EXPRESSION LAMBDA");
		usuario.forEach((us)->{System.out.println(" "+us);});
		//Method Reference
		System.out.println("USANDO METHOD REFERENCE");
		usuario.forEach(System.out::println);
	}
}
