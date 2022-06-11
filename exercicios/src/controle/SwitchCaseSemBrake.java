package controle;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SwitchCaseSemBrake {
   public static void main(String[]args) {
	  String n1=JOptionPane.showInputDialog("Digite um n�mero para c�cular");
	  double num1=Double.parseDouble(n1);
	  String op=JOptionPane.showInputDialog("Digite o operador que deseja fazer o c�lculo:");
	  String n2=JOptionPane.showInputDialog("Digite outro n�mero:");
	  double num2=Double.parseDouble(n2);
	  DecimalFormat fmt=new DecimalFormat("#.0");
	  switch(op) {
	     case "+":
	    	 System.out.println("A soma �: "+fmt.format((num1+num2)));
	    	 break;
	     case "-":
	    	 System.out.println("A subtra��o �: "+fmt.format((num1-num2)));
	    	 break;
	     case "*":
	    	 System.out.println("A multiplica��o �: "+fmt.format((num1*num2)));
	    	 break;
	     case "/":
	    	 System.out.println("A divis�o �: "+fmt.format((num1/num2)));
	    	 break;
	     case "%":
	    	 System.out.println("O resta da divis�o �: "+fmt.format((num1%num2)));
	    	 break;
	     default:
	    	 String txt="Digite um n�mero v�lido!";
	    	 JOptionPane.showMessageDialog(null,txt);
	  }
   }
}
