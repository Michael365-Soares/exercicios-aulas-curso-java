package classe;

public class Equals {
   public static void main(String[] args) {
	   Usuario u1=new Usuario("Michael","michael@");
	   Usuario u2=new Usuario("Michael","michael@");
	   System.out.println(u1==u2);
	   System.out.println(u1.equals(u2));
   }
   //O Hashcode será implementado na próxima aula
}
