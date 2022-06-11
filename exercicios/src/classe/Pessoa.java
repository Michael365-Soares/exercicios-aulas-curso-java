package classe;

import java.text.DecimalFormat;

public class Pessoa {
    String nome;
    double peso;
    double pesoAtual;
    public Pessoa(String nome,double peso) {
    	this.nome=nome;
    	this.peso=peso;
    }
    DecimalFormat f=new DecimalFormat("0.##");
    public String comer(Comida com1,Comida com2) {
    	return String.format("O seu peso antes da refeição era de %.2f e após consumir %s "
    			+ " e %s que somados pesam %.2f calorias seu peso atual é de %.2f!!!",this.peso,com1.tipoComida,
    			com2.tipoComida,(com1.pesoComida+com2.pesoComida),this.peso+(com1.pesoComida+com2.pesoComida)
    			);
    }
}
