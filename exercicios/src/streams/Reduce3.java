package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
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
       //Criando uma BiFunction que irá receber com parâmetro uma Media,Double,Media e retornar uma tipo Media o mesmo irá ser o acumulador para a função reduce
        BiFunction<Media,Double,Media> acumuladorMedia=(ac,n)->ac.adicionar(n);
       //Criando um BinaryOperator<Media> que irá fazer o papel de combinador das notas dentro da função reduce
        BinaryOperator<Media> combinadorMedia=(m1,m2)->Media.combinador(m1, m2);
       //Chamando minha pipeline responsável por retornar o valor geral das notas dos alunos
       /*Para essa papiline irei utilizar a terceira forma do método reduce reduce(valorInicial,BiraryFunction<>,combinador)*/
        Media media=new Media();
        media=alunos.parallelStream()
        .filter(aprovados).
        map(nota).reduce(new Media(),acumuladorMedia,combinadorMedia);
        System.out.println("A média geral dos alunos aprovados é: "+media.getValor());
    }
}
