package fundamentos;

public class NotacaoPonto {
   public static void main(String[] args) {
	   String s="Bom dia X";
	   //Colaca o texto em caixa alta
	   s=s.replace("X", "Senhora");
	   System.out.println(s);
	   //Substitui o valor do elemento por outro valor
	   s=s.toUpperCase();
	   System.out.println(s);
	   //Função concat que irá fazer uma concatenação
	   s=s.concat("!!!");
	   System.out.println(s);
   }
}
