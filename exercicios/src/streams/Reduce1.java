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
       //Criando uma List() de inteiros para ser manipulada nos exercícios
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       /*Criando uma expression lambda que irá ser utilizada como parâmetro para a função reduce() da interface Stream()*/
        BinaryOperator<Integer> notas=(a,b)->a+b;
       /*Utilizando o método reduce() da interface Stream que consiste em um método que recebe como parâmetro uma expression
        * lambda do tipo BinaryOperator utilizando uns dos parêtros da função como acumulador de retorno do que será retornado
        * pelo método reduce*/
        int soma=nums.parallelStream().reduce(notas).get();
        //Imprimindo o resultado do acumulador retornado pelo método reduce
        System.out.println(soma);
        //Utilizando o método reduce utizando um valor inicial para o acumulador
        int soma2=nums.stream().reduce(0,(n1,n2)->n1+n2);
        //Imprimindo o resultado do acumulador retornado pelo método reduce
        System.out.println(soma2);
        //Utilizando o método map e filter e depois encadeando com o método reduce()
        //Resultado foi um Optional<Integer>
        nums.stream().map(num->num+5).filter(num->num%5==0).reduce(notas).ifPresent(System.out::println);
    }
}
