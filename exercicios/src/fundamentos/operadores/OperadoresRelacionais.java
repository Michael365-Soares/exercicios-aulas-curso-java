package fundamentos.operadores;

public class OperadoresRelacionais {
   public static void main(String[]args) {
   Integer a=10;
   Integer b=15;
   //Operador >
   System.out.println(b>a&&a<b);
   //Operador <
   System.out.println(b>a||a<b);
   //Operador =>
   System.out.println(b<=a^a<=b);
   //Operador <=
   System.out.println(b<=a^a<=b);
   //Operador !=
   System.out.println(b!=a^a<=b);
   //Operador ++a pr�-incremento
   System.out.println(++b!=a^a<=b++);
   //Operador a++ p�s-incremento
   System.out.println(b++!=a^a<=b++);
   //Operador --a pr�-decremento
   System.out.println(--b!=a^a<=b++);
   //Operador a-- p�s-decremento
   System.out.println(--b!=a^a<=b--);
   }
}
