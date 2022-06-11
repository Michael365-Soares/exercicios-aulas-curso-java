package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OutrosMetodos {
     public static void main(String[] args) {
    	//Intanciando objetos do tipo aluno
   	    Aluno a1=new Aluno("Michael",9.9);
         Aluno a2=new Aluno("Antonia",10.0);
         Aluno a3=new Aluno("Ryan",9.9);
         Aluno a4=new Aluno("Bia",6.0);
         Aluno a5=new Aluno("Gui",5.9);
         Aluno a6=new Aluno("Di",6.9);
         Aluno a7=new Aluno("Ryan",9.9);
         Aluno a8=new Aluno("Bia",6.0);
         Aluno a9=new Aluno("Gui",5.9);
         Aluno a10=new Aluno("Di",6.9);
         
         //Criando uma Lista de objetos do tipo aluno
         List<Aluno>  alunos=Arrays.asList(a1,a2,a3,a4,a5,a6,a6,a7,a8,a9,a10);
         Consumer<Aluno> println=System.out::println;
         System.out.println("distinct....");
         //Seleciona somente os elementos de forma a não retornar se os repetidos
         alunos.stream().distinct().forEach(println);
         //método Skip() pula os elementos de acordo com o parâmetro passado e limit e retorna somente a quantidade de elementos passados
         //como parâmetro
         System.out.println("\n Skipq/Limit");
         alunos.stream().distinct().skip(2).limit(2).forEach(println);
         //Método takeWhile recebe como parâmetro um Predicate<> e retorna os elementos enquanto a condição passada for verdadeiras
         System.out.println("\n takeWhile");
         alunos.stream().distinct().takeWhile(a->a.nota>=6.0).forEach(println);
         
     }
}
