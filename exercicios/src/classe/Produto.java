package classe;

public class Produto {
   String nome;
   double preco;
   static double desconto=0.25;
   double descontoProduto() {
	   double resultadoDesconto=preco*(1-desconto);
	   return resultadoDesconto;
   }
}
