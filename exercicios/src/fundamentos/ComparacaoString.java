package fundamentos;

import java.util.Scanner;
public class ComparacaoString {
   public static void main(String[] args) {
	   System.out.println("2"=="2");
	   String  s=new String("2");
	   System.out.println("2".equals(s));
	   Scanner input=new Scanner(System.in);
	   String a=input.nextLine();
	   System.out.println("2".equals(a.trim()));
	   input.close();
   }
}
