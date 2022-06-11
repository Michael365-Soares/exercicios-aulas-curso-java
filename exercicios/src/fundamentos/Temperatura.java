package fundamentos;

public class Temperatura {
   public static void main(String[] args) {
	   //(*F-32)*5/9="C"
	   final double fatorDeAjuste=32;
	   final double fatorMultiplicativo=5/9.0;
	   final float temperaturaFahrenheit=20;
	   double resultado=(temperaturaFahrenheit-fatorDeAjuste)*fatorMultiplicativo;
	   System.out.println(
			   "A temperatura de "+ temperaturaFahrenheit+
			   "ºC convertida para graus fahrenheit é de: "+resultado  
	   );
   }
}
