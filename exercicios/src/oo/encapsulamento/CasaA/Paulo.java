package oo.encapsulamento.CasaA;

public class Paulo{
     void testeAcessos() {
    	 Ana esposa=new Ana();
    	 System.out.println("Eu consigo enchergar os atributos: "+esposa.facoDentroDeCasa+
    			 " que � v�sivel dentro do pacote e "+esposa.todosSabem+" que � p�blico e "+
    			 " "+esposa.formaDeFalar+" que � passado por meio de heran�a ou por estarem dentro do mesmo pacote."
    	 );    
     }
}
