package fundamentos;

public class TiposPrimitivos {
   public static void main(String[] args) {
	   //Tipos inteiros
	   byte anosDeEmpresa=15;
	   short numeroDeVoos=555;
	   int id=555789;
	   long pontosAcumulados=3_234_845_235L;
	   //Tipos n�mericos reais
	   float salario=11_256.35F;
	   double vendasAcumuladas=5_565_322_32;
	   //Tipo booleano
	   boolean estaDeFerias=false;//true
	   //Tipo caractere
	   //char status='A';
	   //Dias de empresa
	   System.out.println(anosDeEmpresa*365);
	   //N�mero de viagens
	   System.out.println(numeroDeVoos/2);
	   //Pontos acumulados
	   System.out.println(pontosAcumulados/vendasAcumuladas);
	   //ID
	   System.out.println("O id: "+id+" ganha um sal�rio de "+salario);
	   //F�rias
	   System.out.println("O funcion�rio est� de f�rias? "+estaDeFerias);
   }
}
