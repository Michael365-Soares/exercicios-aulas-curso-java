package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
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
        Predicate<Aluno> reprovados=aprovados.negate();
        /*Utilizando a função da classe static Stream allMatch() que recebe como parâmetro um Predicate
         * e verifica se todos os argumentos passados pela stream se encaixam dentro do contexto
         * verificado pela function do tipo Predicate*/
        System.out.println(alunos.stream().allMatch(aprovados));
        /*Utilizando a função da classe static Stream allMatch() que recebe como parâmetro um Predicate
         * e verifica se pelo menos um dos argumentos passados pela stream se encaixam dentro do contexto
         * verificado pela function do tipo Predicate*/
        System.out.println(alunos.stream().anyMatch(aprovados));
        /*Utilizando a função da classe static Stream allMatch() que recebe como parâmetro um Predicate
         * e verifica nenhum dos argumentos passados pela stream se encaixam dentro do contexto
         * verificado pela function do tipo Predicate*/
        System.out.println(alunos.stream().noneMatch(reprovados));

    }
}
