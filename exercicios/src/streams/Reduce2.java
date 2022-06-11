package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
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
     
     //Criando um Predicate
      Predicate<Aluno> aprovados=al->al.nota>=7.0;
     //Criando uma function que recebe uma Aluno e retorna sua nota
      Function<Aluno,Double> nota=al->al.nota;
     //Criando uma BinaryOperator que recebe todos as notas dos alunos e retorna a média geral
      BinaryOperator<Double> mediaGeral=(m,notas)->{
    	  m+=notas;
    	  return m/2;
      };
      //Usando o método stream() e encadeando funções intermediárias
      alunos.parallelStream().filter(aprovados).map(nota).reduce(mediaGeral).ifPresent(System.out::print);
   }
}
