package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If {
    public static void main(String[] args) {
    	double peso=0;
    	double altura=0,imc=0;
    	String nome,resultado;
    	Scanner input=new Scanner(System.in);
    	System.out.println("######CÁLCULANDO O SEU IMC#######");
    	System.out.println("Insira seu peso:");
    	peso=input.nextDouble();
    	System.out.println("Insira sua altura:");
    	altura=input.nextDouble();
    	System.out.println("Digite seu nome:");
    	nome=input.next();
    	imc=peso*Math.pow(altura,2);
    	if(imc<16.9) {
    		resultado=" "+nome.trim()+" você está muito abaixo do peso!";
    		JOptionPane.showMessageDialog(null, resultado);
    	}else {
    		if(imc<18.4) {
    			resultado=" "+nome.trim()+"  abaixo do peso!";
        		JOptionPane.showMessageDialog(null, resultado);
    		}else {
    			if(imc>=18.8||imc<=24.9) {
    				resultado=" "+nome.trim()+"  seu peso está normal!";
            		JOptionPane.showMessageDialog(null, resultado);
    			}else {
    				if(imc>=25||imc<=29.9) {
    					resultado=" "+nome.trim()+"  você está acima do peso!";
                		JOptionPane.showMessageDialog(null, resultado);
    				}else {
    					if(imc>=30) {
    						resultado=" "+nome.trim()+"  você está obeso!";
                    		JOptionPane.showMessageDialog(null, resultado);
    					}
    				}
    			}
    		}
    	}
    	input.close();
    	if(imc%5==0) {
    		resultado=" "+nome.trim()+" parabéns você ganhou um desconto na PIZZARIA BUTT!";
    		JOptionPane.showMessageDialog(null, resultado);
    	}
    }
}
