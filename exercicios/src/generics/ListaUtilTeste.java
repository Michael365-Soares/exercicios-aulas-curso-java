package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
    	List<String> langs=Arrays.asList("Java","Kotlin","Js","C#");
    	List<String> lang2=Arrays.asList("PHP","SQL","C");
    	List<Integer> num=Arrays.asList(45,5,58,56,36,89,71,52);
    	List<Integer> num2=Arrays.asList(0,1,2,3,45,6,7,8,6);
    	String t0=(String)ListaUtil.getUltimo1(langs);
    	System.out.println(t0);
    	
    	Integer t1=(Integer)ListaUtil.getUltimo1(num);
    	System.out.println(t1);
    	
    	String t2=ListaUtil.getUltimo2(langs);
    	System.out.println(t2);
    	
    	Integer t3=ListaUtil.getUltimo2(num);
    	System.out.println(t3);
    	
    	Integer t4=ListaUtil.getUltimo3(num,num2);
    	System.out.println(t4);
    	
    	String t5=ListaUtil.getUltimo3(lang2,langs);
    	System.out.println(t5);
    }
}
