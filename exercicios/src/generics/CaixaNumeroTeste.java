package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
    	CaixaNumero<Double> c=new CaixaNumero<>();
    	c.guardar(3.5555);
    	System.out.println(c.abrir());
    	
    	CaixaNumero<Integer> d=new CaixaNumero<>();
    	d.guardar(3);
    	System.out.println(d.abrir());
    }
}
