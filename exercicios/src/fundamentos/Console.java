package fundamentos;
import java.util.Scanner;
public class Console {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.printf("Digite seu %s: ","nome");
	  String nome=input.nextLine();
	  System.out.printf("Ol� %s seja bem vindo!!!\n",nome);
	  System.out.println("Digite seu telefone:");
	  int telefone=input.nextInt();
	  System.out.printf("Seu telefone � %d.",telefone);
	  input.close();
  }
}
