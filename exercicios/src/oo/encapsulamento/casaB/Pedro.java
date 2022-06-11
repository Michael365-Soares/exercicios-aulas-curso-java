package oo.encapsulamento.casaB;

import oo.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
     void testeAcesso() {
    	//Por ser passado por herança modificadores public/protected não são necessários serem acessados
    	 //por meio de uma instância de objeto, pois os mesmos já são herdados
    	 System.out.println("Acesso public: "+todosSabem);
    	 System.out.println("Acesso protected: "+formaDeFalar);
     }
}
