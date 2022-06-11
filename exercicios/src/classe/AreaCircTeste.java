package classe;

import javax.swing.JOptionPane;

public class AreaCircTeste {
   public static void main(String[] args) {
	   AreaCirc area=new AreaCirc(6.5);
	   String resultado=area.areaDaCircunferencia();
	   JOptionPane.showMessageDialog(null, resultado);
   }
}
