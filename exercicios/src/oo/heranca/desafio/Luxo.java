package oo.heranca.desafio;

public interface Luxo {
   boolean arCondicionado=false;
   void ligarArCondicionado();
   void desligarArCondicionado();
   
   default int velocidadeDoAr() {
	   return 1;
   }
}
