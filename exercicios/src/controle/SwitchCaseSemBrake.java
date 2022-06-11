package controle;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SwitchCaseSemBrake {
   public static void main(String[]args) {
	  String n1=JOptionPane.showInputDialog("Digite um número para cácular");
	  double num1=Double.parseDouble(n1);
	  String op=JOptionPane.showInputDialog("Digite o operador que deseja fazer o cálculo:");
	  String n2=JOptionPane.showInputDialog("Digite outro número:");
	  double num2=Double.parseDouble(n2);
	  DecimalFormat fmt=new DecimalFormat("#.0");
	  switch(op) {
	     case "+":
	    	 System.out.println("A soma é: "+fmt.format((num1+num2)));
	    	 break;
	     case "-":
	    	 System.out.println("A subtração é: "+fmt.format((num1-num2)));
	    	 break;
	     case "*":
	    	 System.out.println("A multiplicação é: "+fmt.format((num1*num2)));
	    	 break;
	     case "/":
	    	 System.out.println("A divisão é: "+fmt.format((num1/num2)));
	    	 break;
	     case "%":
	    	 System.out.println("O resta da divisão é: "+fmt.format((num1%num2)));
	    	 break;
	     default:
	    	 String txt="Digite um número válido!";
	    	 JOptionPane.showMessageDialog(null,txt);
	  }
   }
}
