package classe;

public class DataTeste {
   public static void main(String[] args) {
	   Data date=new Data(16,9,1994);
	   System.out.printf(date.dataFormatada());
	   System.out.println();
	   System.out.printf(date.dataFormatada(date)+"\n");
	   Data dat=new Data();
	   System.out.println(dat.dataFormatada());
   }
}
