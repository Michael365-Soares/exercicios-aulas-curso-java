package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
    	Scanner ent=new Scanner(System.in);
    	String txt="";
    	do{
    		System.out.println("Digite qualquer  coisa: ");
            txt=ent.next();
    	}while(!txt.equalsIgnoreCase("sair"));
    	System.out.println("FIM!!!");
    	ent.close();
    }
}
