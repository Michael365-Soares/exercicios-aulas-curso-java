package classe;

public class Jantar {
    public static void main(String[] args) {
    	Comida c1=new Comida("Arroz",0.200);
    	Comida c2=new Comida("Feijão",0.100);
    	Pessoa p1=new Pessoa("Michael",70.2);
    	String resultado=p1.comer(c1, c2);
    	System.out.println(resultado);
    }
}
