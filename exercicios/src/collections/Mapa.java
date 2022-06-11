package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
    	Map<Integer,Usuario> usuarios=new HashMap<>();
    	//Adicionando elementos ao mapa
    	//put() adiciona como também altera elementos no mapa
    	usuarios.put(1,new Usuario("Michael Soares"));
    	usuarios.put(2,new Usuario("Michael"));
    	usuarios.put(3,new Usuario("Ryan"));
    	usuarios.put(4,new Usuario("Antonia"));
    	usuarios.put(2,new Usuario("Lucas"));
    	//KeySet() retorna o conjunto de chaves do mapa
    	System.out.println(usuarios.keySet());
    	//entrySet retorna o conjunto de chaves e valores
    	System.out.println(usuarios.entrySet());
    	//values retorna o conjunto de valores pertecentes ao mapa
    	System.out.println(usuarios.values());
    	//Verifica se uma determinada cheve esta contida dentro do map
    	System.out.println(usuarios.containsKey(3));
    	//Verifica se um determinado valor está contido no mapa
    	System.out.println(usuarios.containsValue(new Usuario("Michael Soares")));
    	//Buscando elemento pelo valor de sua chave
    	System.out.println(usuarios.get(1));
    	//Removendo elementos do map
    	  //System.out.println(usuarios.remove(1));
    	  //System.out.println(usuario.remove(1,"Michael Soares"));   
    	//formas de percorrer um mapa
    	for(Usuario usuario:usuarios.values()) {
    		System.out.println(usuario);
    	}
    	System.out.println("======================================");
    	for(Integer usuario:usuarios.keySet()) {
    		System.out.println(usuario);
    	}
    	System.out.println("======================================");
    	for(Entry<Integer,Usuario> usuario:usuarios.entrySet()) {
    		System.out.println(usuario);
    		System.out.println(usuario.getKey());
    		System.out.println(usuario.getValue());
    	}
    	//Percorrendo uma mapa usando Mthod reference
    	System.out.println("Percorrendo uma mapa usando Method reference");
    	usuarios.entrySet().forEach(System.out::println);
    	System.out.println("Percorrendo uma mapa usando Lambda");
    	usuarios.values().forEach((usua)->System.out.println(usua.nome));
    }
}
