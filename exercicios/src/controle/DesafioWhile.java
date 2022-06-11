package controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
    	double nota=0;
    	int qtdNotasValidas=0;
    	double somaDasNotas=0;
    	Scanner ent=new Scanner(System.in);
    	while(nota>=0&&nota<=10) {
    		System.out.println("Digite sua nota:");
    		nota=ent.nextDouble();
    		somaDasNotas+=nota;
    		qtdNotasValidas++;
    	}
    	DecimalFormat fmt=new DecimalFormat("#.00");
    	System.out.println("A quantida de notas válidas são: "+qtdNotasValidas);
    	System.out.println("A sua média é: "+fmt.format((somaDasNotas/qtdNotasValidas)));
    	ent.close();
    }
}
