package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class DesafioArray {
   public static void main(String[] args) {
	   //Craindo uma variável para somatório de todas as notas
	   double somaDasNotas=0.0;
	   //Criando uma variável do tipo String de nome l que será responsável  por receber uma String de um algarismo qualquer
	   String l=JOptionPane.showInputDialog("Digite a quantidade de alunos: ");
	   /*Criando a variável qtdAlunos que irá receber um int retornado da conversão da variável "l" para inteiro*/
	   int qtdAlunos=Integer.parseInt(l);
	   //Criando uma variável do tipo String de nome "c" que será responsável  por receber uma String de um algarismo qualquer
	   String c=JOptionPane.showInputDialog("Digite a quantidade de notas que deseja inserir: ");
	   /*Criando a variável qtdNotas que irá receber um int retornado da conversão da variável "c" para inteiro*/
	   int qtdNotas=Integer.parseInt(c);
	   /*Criando uma array multidimensional do tipo double que irá receber como parâmetro para dimensionar o seu tamanho
	    * a variável qtdAlunos que representará o número de linhas que o mesmo deverá conter e receberá a variável qtdNotas
	    * que representará a quantide de colunas que o mesmo deverá conter para armazenagem das notas de cada aluno...*/
	   double[][] array=new double[qtdAlunos][qtdNotas];
	   /*Criando um laço for que será responsável por percorrer o array multidirecional e efetuar seu preenchimento;
	    * o primeiro laço for será responsável por percorrer cada linha da matriz que representará uma aluno cada....*/
	   for(int i=0;i<array.length;i++) {
		   for(int j=0;j<array[i].length;j++) {
			   String y=JOptionPane.showInputDialog("Digite as notas do "+(i+1)+"º aluno: ");
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
	   String out="A média de notas dos "+qtdAlunos+" alunos foi de:"+" "+f.format(media);
	   JOptionPane.showMessageDialog(null,out);
	   for(double[] notas:array) {
	      System.out.println(Arrays.toString(notas));
	   }
   }
}
