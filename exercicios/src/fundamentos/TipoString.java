package fundamentos;

public class TipoString {
    public static void main(String[] args) {
    	System.out.println("Ol� Mundo!".charAt(2));
    	String s="Michael";
    	System.out.println(s.concat(" Soares")
    			.toUpperCase().
    			replace(" SOARES"," Oliveira")	
    	);
    	//Verifica se a string inicia com o par�metro passado
    	System.out.println(s.startsWith("Michael")); 
    	//Converte para min�sculas e verifica se inicia com o par�metro passado
    	System.out.println(s.toLowerCase().startsWith("MICHAEL")); 
    	//Verifica o tamanho
    	System.out.println(s.length());
    	//Verifica se termina com o par�metro passado
    	System.out.println(s.endsWith("Oliveira"));
    	//Verifica se � igual ao par�metro passado
    	System.out.println(s.equals("Michael Oliveira"));
    	//Verifica se � igual ignorando letras mai�sculas e min�sculas
    	System.out.println(s.equalsIgnoreCase("Michael Oliveira"));
    	System.out.printf("Nome: %s \n",s);
    	String nome=String.format("Nome:%s",s);
    	System.out.println(nome);
    }
}
