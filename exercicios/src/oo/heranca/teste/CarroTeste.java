package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
   public static void main(String[] args) {
	   Ferrari c1=new Ferrari("Ferrari F1000",450);
	   Carro c2=new Civic("Civic Hibrid");
	   System.out.println(c1.getModelo()+" acelerando:");
	   c1.acelerar();
	   System.out.println("Ligando o turbo para acelerar:");
	   c1.ligarTurbo();
	   c1.acelerar();
	   System.out.println(c1.velocidadeDoAr());
	   System.out.println("Desligando o turbo para acelerar:");
	   c1.desligarTurbo();
	   System.out.println("Velocidade atual: "+c1.getVelocidade());
	   System.out.println(c1.getModelo()+" freiando:");
	   c1.frear();
	   c1.frear();
	   System.out.println("Velocidade atual: "+c1.getVelocidade());
	   System.out.println(c2.getModelo()+" acelerando:");
	   c2.acelerar();
	   c2.acelerar();
	   System.out.println("Velocidade atual: "+c2.getVelocidade());
	   System.out.println(c2.getModelo()+" freiando:");
	   c2.frear();
	   c2.frear();
	   System.out.println("Velocidade atual: "+c2.getVelocidade());
   }
}
