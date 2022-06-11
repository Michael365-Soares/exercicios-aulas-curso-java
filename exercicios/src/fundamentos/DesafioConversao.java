package fundamentos;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DesafioConversao {
   public static void main(String[] args) {
	   //java.util.Locale.setDefault(new java.util.Locale("en","us"));
	   Scanner input=new Scanner(System.in);
	   String sl1=JOptionPane.showInputDialog("Digite seu antepenúltimo salário:");
	   sl1.replace(',','.');
	   double s1=Double.parseDouble(sl1);
	   String sl2=JOptionPane.showInputDialog("Digite seu penúltimo salário:");
	   sl2.replace(',','.');
	   double s2=Double.parseDouble(sl2);
	   String sl3=JOptionPane.showInputDialog("Digite seu último salário:");
	   sl3.replace(',','.');
	   double s3=Double.parseDouble(sl3);
	   double mediaSalarial=(s1+s2+s3)/3;
	   DecimalFormat nformat=new DecimalFormat("#,###.00");
	   System.out.println("A média salarial dos últimos três meses é de "+nformat.format(mediaSalarial));
	   input.close();
   }
}
