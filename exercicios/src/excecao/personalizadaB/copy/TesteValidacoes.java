package excecao.personalizadaB.copy;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args){
    	try {
			Aluno al=new Aluno(" ",10.0);
			Validar.aluno(al);
			//Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch(NumeroForaDoIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
    	System.out.println("FIM");
    }
}
