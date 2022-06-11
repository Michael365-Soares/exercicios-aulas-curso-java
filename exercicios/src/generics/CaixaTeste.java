package generics;

public class CaixaTeste {
   public static void main(String args[]) {
	   Caixa<Integer> coisaA=new Caixa<>();
	   coisaA.guardar(10);
	   System.out.println(coisaA.abrir());
	   
	   Caixa<String> coisaB=new Caixa<>();
	   coisaB.guardar("Olá abestado!!!");
	   System.out.println(coisaB.abrir());
	   
	   CaixaInt<Integer> inte=new CaixaInt<>();
	   inte.guardar(1235);
	   System.out.println( inte.abrir());
   }
}
