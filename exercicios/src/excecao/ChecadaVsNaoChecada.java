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
    
    //Exce��o N�O checada ou n�o verificada
    static void geraError1() {
    	throw new RuntimeException("Ocorreu um erro #01!");
    }
    
    /*Excess�o CHECADA ou verificada � necess�rio deixar claro na assinatura do m�todo
     * que o mesmo ir� retorna uma exce��o do tipo checada*/
    static void geraError2() throws Exception {
    	throw new Exception("Ocorreu um erro #02!");
    }
}
