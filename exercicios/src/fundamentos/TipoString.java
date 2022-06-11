package fundamentos;

public class TipoString {
    public static void main(String[] args) {
    	System.out.println("Olá Mundo!".charAt(2));
    	String s="Michael";
    	System.out.println(s.concat(" Soares")
    			.toUpperCase().
    			replace(" SOARES"," Oliveira")	
    	);
    	//Verifica se a string inicia com o parâmetro passado
    	System.out.println(s.startsWith("Michael")); 
    	//Converte para minúsculas e verifica se inicia com o parâmetro passado
    	System.out.println(s.toLowerCase().startsWith("MICHAEL")); 
    	//Verifica o tamanho
    	System.out.println(s.length());
    	//Verifica se termina com o parâmetro passado
    	System.out.println(s.endsWith("Oliveira"));
    	//Verifica se é igual ao parâmetro passado
    	System.out.println(s.equals("Michael Oliveira"));
    	//Verifica se é igual ignorando letras maiúsculas e minúsculas
    	System.out.println(s.equalsIgnoreCase("Michael Oliveira"));
    	System.out.printf("Nome: %s \n",s);
    	String nome=String.format("Nome:%s",s);
    	System.out.println(nome);
    }
}
