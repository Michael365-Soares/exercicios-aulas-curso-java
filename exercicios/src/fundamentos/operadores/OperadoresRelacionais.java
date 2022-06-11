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
   //Operador ++a pré-incremento
   System.out.println(++b!=a^a<=b++);
   //Operador a++ pós-incremento
   System.out.println(b++!=a^a<=b++);
   //Operador --a pré-decremento
   System.out.println(--b!=a^a<=b++);
   //Operador a-- pós-decremento
   System.out.println(--b!=a^a<=b--);
   }
}
