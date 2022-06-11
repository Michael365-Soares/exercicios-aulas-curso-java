package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
    	//Intanciando objetos do tipo aluno
  	    Aluno a1=new Aluno("Michael",9.9);
        Aluno a2=new Aluno("Antonia",10.0);
        Aluno a3=new Aluno("Ryan",9.9);
        Aluno a4=new Aluno("Bia",6.0);
        Aluno a5=new Aluno("Gui",5.9);
        Aluno a6=new Aluno("Di",6.9);
        
        //Criando uma Lista de objetos do tipo aluno
        List<Aluno>  alunos=Arrays.asList(a1,a2,a3,a4,a5,a6);
        
        //Criando uma functional interface do tipo Comparator<Aluno>
        //que irá fazer a comparação e ordenação da stream() de alunos por meio da comparação das notas
        Comparator<Aluno> melhorNota=(al1,al2)->{
        	if(al1.nota>al2.nota) return 1;
        	if(al1.nota<al2.nota) return -1;
        	return 0;
        };
        
        //Utilizando os métodos man() e min() da interface Stream que recebem como parâmetro um Comparator<Aluno>
        // e retorna o aluno com maior e menor nota
        System.out.println(alunos.stream().max(melhorNota).toString());
        System.out.println(alunos.stream().min(melhorNota).toString());
    }
}
