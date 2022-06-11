package arrays;

import java.util.Arrays;

public class Exercicio {
   public static void main(String[] args) {
	   double[] notas=new double[5];
	   boolean[] notas1=new boolean[10];
	   //int[] nums=new int[10];
	   notas[0]=8.9;
	   notas[1]=5.9;
	   notas[2]=9.9;
	   notas[3]=9.9;
	   notas[4]=9.9;
	   System.out.println(Arrays.toString(notas));
	   double total=0;
	   for(int i=0;i<notas.length;i++) {
		   System.out.println(notas[i]);
		   total+=notas[i];
	   }
	   System.out.println(total/notas.length);
	   boolean[] notasAluno= {true,true,true,false};
	   boolean[] notasAluno1= {true,true,true,false};
	   notas1=notasAluno;
	   notas1=notasAluno1;
	   System.out.println(notas1[0]);
	   System.out.println(Arrays.toString(notas1));
	   }
}
