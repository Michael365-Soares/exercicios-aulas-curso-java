package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class DesafioArray {
   public static void main(String[] args) {
	   //Craindo uma vari�vel para somat�rio de todas as notas
	   double somaDasNotas=0.0;
	   //Criando uma vari�vel do tipo String de nome l que ser� respons�vel  por receber uma String de um algarismo qualquer
	   String l=JOptionPane.showInputDialog("Digite a quantidade de alunos: ");
	   /*Criando a vari�vel qtdAlunos que ir� receber um int retornado da convers�o da vari�vel "l" para inteiro*/
	   int qtdAlunos=Integer.parseInt(l);
	   //Criando uma vari�vel do tipo String de nome "c" que ser� respons�vel  por receber uma String de um algarismo qualquer
	   String c=JOptionPane.showInputDialog("Digite a quantidade de notas que deseja inserir: ");
	   /*Criando a vari�vel qtdNotas que ir� receber um int retornado da convers�o da vari�vel "c" para inteiro*/
	   int qtdNotas=Integer.parseInt(c);
	   /*Criando uma array multidimensional do tipo double que ir� receber como par�metro para dimensionar o seu tamanho
	    * a vari�vel qtdAlunos que representar� o n�mero de linhas que o mesmo dever� conter e receber� a vari�vel qtdNotas
	    * que representar� a quantide de colunas que o mesmo dever� conter para armazenagem das notas de cada aluno...*/
	   double[][] array=new double[qtdAlunos][qtdNotas];
	   /*Criando um la�o for que ser� respons�vel por percorrer o array multidirecional e efetuar seu preenchimento;
	    * o primeiro la�o for ser� respons�vel por percorrer cada linha da matriz que representar� uma aluno cada....*/
	   for(int i=0;i<array.length;i++) {
		   for(int j=0;j<array[i].length;j++) {
			   String y=JOptionPane.showInputDialog("Digite as notas do "+(i+1)+"� aluno: ");
			   y=y.contains(",")?y.replace(",","."):y;
			   array[i][j]=Double.parseDouble(y);
			   if(j<=qtdNotas) continue;
		   }
	   } 
	   for(int i=0;i<array.length;i++) {
		   for(int j=0;j<array[i].length;j++) {
		     somaDasNotas+=array[i][j];
		   }
	   }
	   double media=somaDasNotas/(qtdNotas*qtdAlunos);
	   DecimalFormat f=new DecimalFormat("#.0");
	   String out="A m�dia de notas dos "+qtdAlunos+" alunos foi de:"+" "+f.format(media);
	   JOptionPane.showMessageDialog(null,out);
	   for(double[] notas:array) {
	      System.out.println(Arrays.toString(notas));
	   }
   }
}
