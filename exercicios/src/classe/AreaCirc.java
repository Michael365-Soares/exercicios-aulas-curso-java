package classe;

import java.text.DecimalFormat;

public class AreaCirc {
   static final double PI=3.141616;
   public double raio=0;
   public AreaCirc(double raio) {
	   this.raio=raio;
   }
   DecimalFormat fmt=new DecimalFormat("#.00");
   public String areaDaCircunferencia() {
	   return "A área da circuferência é: "+fmt.format((3*PI)*Math.pow(raio,2))+"m2";
   }
}
