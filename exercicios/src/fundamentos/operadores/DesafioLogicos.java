package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[]args) {
    	//Trabalho na ter�a(v ou f)
    	boolean tr01=false;
    	//Trabalho na quinta(v ou f)
    	boolean tr02=true;
    	//Est� saud�vel
    	boolean saudavel=true;
    	boolean tv32=true;
    	boolean tv50=false;
    	boolean tomouSorvete=false;
    	if(tr01||tr02) {
    		System.out.println("Comprou tv 32");
    		tv32=true;
    	}else {
    		if(tr01&&tr02) {
    			System.out.println("Comprou tv 50");
    			tv50=true;
    		}
    	}
    	if(tv32||tv50) {
    		tomouSorvete=true;
    		System.out.println("Tomou Sorvete!!!");
    		if(tomouSorvete) {
    			System.out.println("N�o esta saud�vel.");
    		}else {
    			System.out.println(saudavel);
    		}
    	}
    }
}
