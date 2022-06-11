package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Desafio {
   public static void main(String[] args) {
	   Produto p1=new Produto("ipad",3235.89,0.13);
	   //Calculando Desconto
	   BinaryOperator<Double> calculoDesconto=(preco,desconto)->{
		  double precoComDesconto=preco-(1*desconto);
		  return precoComDesconto;
	   };
	   //Calculando imposto municipal
	   UnaryOperator<Double> impostoMunicipal=(preco)->{
		  double precoComDescontoMunicipal= preco>=2.500 ? preco*1.085 : preco;
		  return precoComDescontoMunicipal;
	   };
	   //Calculando taxa de frete
	   UnaryOperator<Double> taxaDeFrete=(preco)->{
		   double precoComTaxaDeFrete=preco>=3000?(preco+100):(preco+50);
		   return precoComTaxaDeFrete;
	   };
	   //Formatando e imprimindo
	   Consumer<Double> precoFinal=(preco)->{
		   p1.setPreco(preco);
		   System.out.printf("O produto: %s custa o valor de R$ %.2f .",p1.nome,p1.getPreco());
	   };
	   //Chamando as funções lambdas
	   Double preco=calculoDesconto.andThen(impostoMunicipal).andThen(taxaDeFrete).apply(p1.getPreco(),p1.desconto);
	  // DecimalFormat fmt=new DecimalFormat("#.00");
	  // fmt.format(preco);
	   precoFinal.accept(preco);
   }
}
