package fundamentos;



import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
    	//Vari�veis para cria��o da l�gica matem�tica
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
    	n1=JOptionPane.showInputDialog("Digite o primeiro n�mero:");
    	//CONVERS�O DE STRING PARA INTEIRO
    	num1=Integer.parseInt(n1);
    	//ENTRADO DO SEGUNDO D�GITO
    	n2=JOptionPane.showInputDialog("Digite o segundo n�mero:");
    	//CONVERS�O DE STRING PARA INTEIRO
    	num2=Integer.parseInt(n2);
    	//ENTRADA DO OPERADOR DA OPERA��O
    	op=JOptionPane.showInputDialog("Digite o s�mbolo da opera��o a realizar:");
    	//VERIFICANDO SE O OPERADOR � V�LIDO
    	boolean opValido=op.equals(adicao)||op.equals(subtracao)||op.equals(multi)||op.equals(div)||
    	op.equals(mod);
    	//VERIFICANDO SE O OPERADOR FOI PASSADO
    	boolean opPreenchido=op.equals("");
    	//VARI�VEL PARA RECEBER O RESULTADO
        String resultado;
        /*L�GICA PARA EFETUAR AS OPERA��ES:
         * VERIFICA SE O RESULTADO  DA FUN��O OP.EQUALS(OP) � VERDADEIRO
         * E SE FOI PASSADO UMA STRING VAZIA
         * CASO AS DUAS L�GICAS FOREM VERDADEIRAS
         * EXECUTA OS C�LCULO SOLICITADO
         * */
		resultado = opValido==true&&opPreenchido==false?"A soma de "+num1+" e "+num2+" �: "+(num1+num2):"0";
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A subtra��o de "+num1+" e "+num2+" �: "+(num1-num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A multiplica��o de "+num1+" e "+num2+" �: "+(num1*num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"A divis�o de "+num1+" e "+num2+" �: "+(num1/num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
		resultado = opValido==true&&opPreenchido==false?"O resto da divis�o de "+num1+" e "+num2+" �: "+(num1%num2):resultado;
		JOptionPane.showMessageDialog(null,resultado);
    }
}
