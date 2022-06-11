package classe;

public class ValorXReferenciaTeste {
    public static void main(String[] args) {
    	int a=5;
    	int b=a;//passagem por valor
    	a++;
    	b--;
    	System.out.println("Atribui��o de vari�vel por valor:");   	
    	System.out.printf("a=%d/b=%d\n",a,b);
    	//Passagem de valor por refer�ncia
    	Data d1=new Data(16,9,1995);
    	Data d2=d1;
    	System.out.println("Atribui��o de vari�vel por refer�ncia 01:");   
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
        d1.setDia(16);
        d1.setMes(9);
        d1.setAno(2021);
        System.out.println("Atribui��o de vari�vel por refer�ncia 02:");  
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
