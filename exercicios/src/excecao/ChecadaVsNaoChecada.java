package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
    	try {
			geraError1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
    	
    	try {
			geraError2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
    	
    	System.out.println("Fim!!!");
    }
    
    //Exceção NÃO checada ou não verificada
    static void geraError1() {
    	throw new RuntimeException("Ocorreu um erro #01!");
    }
    
    /*Excessão CHECADA ou verificada é necessário deixar claro na assinatura do método
     * que o mesmo irá retorna uma exceção do tipo checada*/
    static void geraError2() throws Exception {
    	throw new Exception("Ocorreu um erro #02!");
    }
}
