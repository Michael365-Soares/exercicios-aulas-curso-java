package oo.encapsulamento.casaB;

import oo.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
     void testeAcesso() {
    	//Por ser passado por heran�a modificadores public/protected n�o s�o necess�rios serem acessados
    	 //por meio de uma inst�ncia de objeto, pois os mesmos j� s�o herdados
    	 System.out.println("Acesso public: "+todosSabem);
    	 System.out.println("Acesso protected: "+formaDeFalar);
     }
}
