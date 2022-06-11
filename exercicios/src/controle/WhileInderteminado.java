package controle;

import java.util.Scanner;

public class WhileInderteminado {
   public static void main(String[] args) {
	   String txt="sair";
	   String txtInserido="";
	   Scanner ent=new Scanner(System.in);
	   while(txtInserido.equalsIgnoreCase(txt)==false) {
		   System.out.println("Digite qualquer coisa: ");
		   txtInserido=ent.next();
		   System.out.println("Digite \"sair\" para parar o programa");
	   }
	   System.out.println("FIM!!!");
	   ent.close();
   }
}
