package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
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
       //Criando uma List() de inteiros para ser manipulada nos exerc�cios
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       /*Criando uma expression lambda que ir� ser utilizada como par�metro para a fun��o reduce() da interface Stream()*/
        BinaryOperator<Integer> notas=(a,b)->a+b;
       /*Utilizando o m�todo reduce() da interface Stream que consiste em um m�todo que recebe como par�metro uma expression
        * lambda do tipo BinaryOperator utilizando uns dos par�tros da fun��o como acumulador de retorno do que ser� retornado
        * pelo m�todo reduce*/
        int soma=nums.parallelStream().reduce(notas).get();
        //Imprimindo o resultado do acumulador retornado pelo m�todo reduce
        System.out.println(soma);
        //Utilizando o m�todo reduce utizando um valor inicial para o acumulador
        int soma2=nums.stream().reduce(0,(n1,n2)->n1+n2);
        //Imprimindo o resultado do acumulador retornado pelo m�todo reduce
        System.out.println(soma2);
        //Utilizando o m�todo map e filter e depois encadeando com o m�todo reduce()
        //Resultado foi um Optional<Integer>
        nums.stream().map(num->num+5).filter(num->num%5==0).reduce(notas).ifPresent(System.out::println);
    }
}
