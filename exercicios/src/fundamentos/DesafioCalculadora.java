package fundamentos;



import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
    	//Variáveis para criação da lógica matemática
    	String n1;
    	String n2;
    	int num1=0;
    	int num2=0;
    	String adicao="+";
    	String subtracao="-";
    	String multi="*";
    	String div="/";
    	String mod="%";
    	String op="";
    	//ENTRADA DOS PRIMEIRO DIGITO
    	n1=JOptionPane.showInputDialog("Digite o primeiro número:");
    	//CONVERSÃO DE STRING PARA INTEIRO
    	num1=Integer.parseInt(n1);
    	//ENTRADO DO SEGUNDO DÍGITO
    	n2=JOptionPane.showInputDialog("Digite o segundo número:");
    	//CONVERSÃO DE STRING PARA INTEIRO
    	num2=Integer.parseInt(n2);
    	//ENTRADA DO OPERADOR DA OPERAÇÃO
    	op=JOptionPane.showInputDialog("Digite o símbolo da operação a realizar:");
    	//VERIFICANDO SE O OPERADOR É VÁLIDO
    	boolean opValido=op.equals(adicao)||op.equals(subtracao)||op.equals(multi)||op.equals(div)||
    	op.equals(mod);
    	//VERIFICANDO SE O OPERADOR FOI PASSADO
    	boolean opPreenchido=op.equals("");
    	//VARIÁVEL PARA RECEBER O RESULTADO
        String resultado;
        /*LÓGICA PARA EFETUAR AS OPERAÇÕES:
         * VERIFICA SE O RESULTADO  DA FUNÇÃO OP.EQUALS(OP) É VERDADEIRO
         * E SE FOI PASSADO UMA STRING VAZIA
         * CASO AS DUAS LÓGICAS FOREM VERDADEIRAS
         * EXECUTA OS CÁLCULO SOLICITADO
         * */
		resultado = opValido==true&&opPreenchido==false?"A soma de "+num1+" e "+num2+" é: "+(num1+num2):"0";
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A subtração de "+num1+" e "+num2+" é: "+(num1-num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A multiplicação de "+num1+" e "+num2+" é: "+(num1*num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A divisão de "+num1+" e "+num2+" é: "+(num1/num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"O resto da divisão de "+num1+" e "+num2+" é: "+(num1%num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
    }
}
