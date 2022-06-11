package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number,V> {
    private final Set<Par<C,V>> itens=new LinkedHashSet<>(); 
    
    public void adicionar(C chave,V valor) {
    	if(chave==null) return;
    	Par<C,V> novoPar=new Par<>(chave,valor);
    	if(itens.contains(novoPar)) {
    		itens.remove(novoPar);
    	}
        itens.add(novoPar);	
    }
    
    public V getValor(C chave) {
    	if(chave==null) return null;
    	Optional<Par<C,V>> par= itens.stream().
    			filter(e->chave.equals(e.getChave())).
    			findFirst();
    	return par.isPresent()?par.get().getValor():null;
    }
    
    public boolean delete(C chave) {
    	Optional<Par<C,V>> par=itens.stream().filter(e->chave.equals(chave)).findFirst();
    	return itens.remove(par.get());
    }    
    
    public void forEach() {
    	itens.stream().forEach(System.out::println);
    }
}
