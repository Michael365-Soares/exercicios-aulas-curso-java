package generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimo1(List<?> list) {
    	return list.get(list.size()-1);
    }
    
    public static <T> T getUltimo2(List<T> list) {
    	return list.get(list.size()-1);
    }
    
    public static <T extends C,C> C getUltimo3(List<T> listTipT,List<C> listTipC){
    	return listTipC.get(listTipC.size()-3);
    }
}
