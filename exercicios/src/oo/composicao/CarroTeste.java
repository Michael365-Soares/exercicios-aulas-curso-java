package oo.composicao;

public class CarroTeste {
   public static void main(String[]args) {
	   Carro c1=new Carro();
	   c1.ligar();
	   //c1.desligar();
	   c1.acelerar(100);
	   c1.ligarTurbo();
	   System.out.println(c1.motor.giros());
	   c1.frear();
	   System.out.println(c1.motor.giros());
	   //Relaçao BI-DIRECIONAL
	   c1.motor.carro.desligar();
   }
}
