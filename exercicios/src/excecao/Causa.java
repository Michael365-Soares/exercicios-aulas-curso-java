package excecao;

public class Causa {
    public static void main(String[] args){
        try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause()!=null) {
				System.out.println(e.getCause().getMessage());
			}
		}	
    }
    
    static void metodoA(Aluno a) {
    	try {
			metodoB(a);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
    }
    
    static void metodoB(Aluno b) {
    	if(b==null) throw new NullPointerException("O aluno passado está nulo....");
    	System.out.println(b.nome);
    }
}
