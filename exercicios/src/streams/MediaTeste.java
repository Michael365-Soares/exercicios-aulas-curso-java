package streams;

public class MediaTeste {
   public static void main(String[] args) {
	   Media m1=new Media();
	   m1.adicionar(10.0).adicionar(10.0);
	   Media m2=new Media();
	   m1.adicionar(10.0).adicionar(10.0);
	   System.out.println( Media.combinador(m1, m2).getValor());
   }
}
