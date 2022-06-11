package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
    	List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	Consumer<Object> print=System.out::print;
    	/*
    	 * 1.Número para String binária...6=>110
    	 * 2.Reverter a string... 110=>011
    	 * 3.Converter de volta para inteiro=>"011"=>3*/
    	//Minha resolução
    	System.out.println("Minha resolução");
    	nums.stream().map(Utilitarios.conversorDeInteiros).
    	map(Utilitarios.inversorDeString).
    	map(Utilitarios.conversorStringInteger).forEach(print);
    	System.out.println("\n");
    	System.out.println("Resolução do professor");
    	//###Resolução do professor
    	nums.stream().
    	map(Integer::toBinaryString).
    	map(Utilitarios.inversorDeString).
    	map(Utilitarios.conversorStringInteger).
    	forEach(System.out::println);
    };
}
