package oo.encapsulamento.CasaA;

public class Paulo{
     void testeAcessos() {
    	 Ana esposa=new Ana();
    	 System.out.println("Eu consigo enchergar os atributos: "+esposa.facoDentroDeCasa+
    			 " que é vísivel dentro do pacote e "+esposa.todosSabem+" que é público e "+
    			 " "+esposa.formaDeFalar+" que é passado por meio de herança ou por estarem dentro do mesmo pacote."
    	 );    
     }
}
