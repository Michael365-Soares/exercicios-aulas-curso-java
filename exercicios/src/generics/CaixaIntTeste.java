package generics;

public class CaixaIntTeste {
   public static void main(String args[]) {
	   CaixaInt<Integer> c=new CaixaInt<>();
	   c.guardar(100);
	   Integer value=c.abrir();
	   System.out.println(value);
   }
}
