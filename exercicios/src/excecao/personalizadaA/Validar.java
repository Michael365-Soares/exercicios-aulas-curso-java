package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
    private Validar() {}
    
    public static void aluno(Aluno al) {
    	if(al==null) {
    		throw new IllegalArgumentException("O objeto Aluno está nulo...");
    	}
    	
    	if(al.nome==null || al.nome.trim().isEmpty()) {
    		throw new StringVaziaException("Nome");
    	}
    	
    	if(al.nota<0 || al.nota>10) {
    		throw new NumeroForaDoIntervaloException("Nota");
    	}
    }
}
