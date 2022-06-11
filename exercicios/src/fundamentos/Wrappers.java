package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
   //byte
	Byte b=2;
	Short c=300;
	Integer d=1000;
	Long l=10_000_000_000L;
	//Convertendo de byte para float
	System.out.println(b.floatValue());
	//Convertendo de short para double
	System.out.println(c.doubleValue()); 
	//Convertendo de integer para float
	System.out.println(d.floatValue()); 
	//Convertendo de Long para int
	System.out.println(l.intValue());
	Boolean aprovado=Boolean.parseBoolean("true");
	System.out.println(aprovado);
	Character ch='#';
	System.out.println(ch.toString().toUpperCase());
	Float f=123F;
	System.out.println(f.intValue());
	Double doub=123.555;
	System.out.println(doub.floatValue());
    }
}
