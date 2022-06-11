package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoDeNumeroParaString {
    public static void main(String[] args) {
    	Integer num1=100;
    	System.out.println(num1.toString().charAt(0));
    	//Conversão de String para número
    	String num2=JOptionPane.showInputDialog("Digite um número:");
    	String num3=JOptionPane.showInputDialog("Digite outro número:");
    	double numero1=Double.parseDouble(num2);
    	double numero2=Double.parseDouble(num3);
    	double resultado=numero1+numero2;
    	System.out.printf("A soma é "+resultado+"\n");
    	System.out.printf("A média é "+resultado/2);
    }
}
