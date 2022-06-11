package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
   public static void main(String[] args) {
	   System.out.println("Digite um dia da semana:");
	   Scanner entrada=new Scanner(System.in);
	   String diaSemana=entrada.next().trim();
	   String diasSemana[]={"domingo","segunda","terça","quarta","quinta","sexta","sádado"};
	   if(diasSemana[0].equalsIgnoreCase(diaSemana)) {
		   System.out.println("1 dia da semana");
	   }else if(diasSemana[1].equalsIgnoreCase(diaSemana)) {
		   System.out.println("2 dia da semana");
	   }else if(diasSemana[2].equalsIgnoreCase(diaSemana)) {
		   System.out.println("3 dia da semana");
	   }else if(diasSemana[3].equalsIgnoreCase(diaSemana)) {
		   System.out.println("4 dia da semana");
	   }else if(diasSemana[4].equalsIgnoreCase(diaSemana)) {
		   System.out.println("5 dia da semana");
	   }else if(diasSemana[5].equalsIgnoreCase(diaSemana)) {
		   System.out.println("6 dia da semana");
	   }else{
		   System.out.println("7 dia da semana");
	   }
	   entrada.close();
   }
}
