package classe;

public class Data {
   private int dia;
   private int mes;
   private int ano;
   public Data() {
	   //Servi para chamar outro construtor dentro da classe dentro de outro construtor
	   this(30,1,2025);
   }
   public Data(int dia,int mes,int ano) {
	   this.dia=dia;
	   this.mes=mes;
	   this.ano=ano;
   }
   public void setDia(int dia) {
	   this.dia=dia;
   }
   public int getDia() {
	   return this.dia;
   }
   public void setMes(int mes) {
	   this.mes=mes;
   }
   public int getMes() {
	   return this.mes;
   }
   public void setAno(int ano) {
	   this.ano=ano;
   }
   public int getAno() {
	   return this.ano;
   }
   public String dataFormatada(Data date) {
	   return date.getDia()+"/"+date.getMes()+"/"+date.getAno();
   }
   public String dataFormatada() {
	   final String formatar="%d/%d/%d";
	   return String.format(formatar,dia,mes,ano);
   }
}
