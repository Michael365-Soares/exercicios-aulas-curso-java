package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoDeNumeroParaString {
    public static void main(String[] args) {
    	Integer num1=100;
    	System.out.println(num1.toString().charAt(0));
    	//Convers�o de String para n�mero
    	String num2=JOptionPane.showInputDialog("Digite um n�mero:");
    	String num3=JOptionPane.showInputDialog("Digite outro n�mero:");
    	double numero1=Double.parseDouble(num2);
    	double numero2=Double.parseDouble(num3);
    	double resultado=numero1+numero2;
    	System.out.printf("A soma � "+resultado+"\n");
    	System.out.printf("A m�dia � "+resultado/2);
    }
}
