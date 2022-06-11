package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
    	//Criando um conjunto de inteiros
       Set<Integer> conjunto=new HashSet<>();
       //Preenchendo o conjunto com inteiros de 0 a 100
       for(int i=1;i<=100;i++) {
    	   conjunto.add(i);
       }
       //Criando um verificador de n�meros primos
       Predicate<Integer> numPar=(num)->{
    	   boolean isPar=num%2==0?true:false;
    	   return isPar;
       };
       //Usando o m�todo static stream() para filtrar todos os n�meros primos da collection
       conjunto.stream().filter(numPar).forEach(System.out::println);
       //Exerc�cio da aula
       Aluno a1=new Aluno("Michael",9.9);
       Aluno a2=new Aluno("Antonia",10.0);
       Aluno a3=new Aluno("Ryan",9.9);
       Aluno a4=new Aluno("Bia",6.0);
       Aluno a5=new Aluno("Gui",5.9);
       Aluno a6=new Aluno("Di",6.9);
       //Criando uma List e adicionando elementos a ela
       List<Aluno> alunos=new ArrayList<>();
       alunos.add(a1);
       alunos.add(a2);
       alunos.add(a3);
       alunos.add(a4);
       alunos.add(a5);
       alunos.add(a6);
      //Criando expre��es lambdas para filtrar os alunos aprovados e imprimir
       Predicate<Aluno> aprovados=aluno->aluno.nota>=7.0?true:false;
       Consumer<Aluno>  imprimir=aluno->System.out.println("O aluno: "+aluno.nome+" foi aprovado!!!");
       //Usando a fun��o stream e os m�todos filter e map para listar os alunos aprovados
       alunos.stream().filter(aprovados).forEach(imprimir);
       System.out.println("#########3Resolu�a� do desafio da aula:");
       Produto p1=new Produto("Sab�o",0.3,5.50,true);
       Produto p2=new Produto("Notebook",0.5,5.500,true);
       Produto p3=new Produto("Televis�o",0.25,3.300,false);
       Produto p4=new Produto("Play 5",0.2,7.500,true);
       Produto p5=new Produto("Som",0.25,3.350,false);
       Produto p6=new Produto("XBox",0.22,7.200,true);
       //Criando uma collection do tipo List<> de produtos
       List<Produto> prod=Arrays.asList(p1,p2,p3,p4,p5,p6);
       //Criando uma function Lambda do tipo Predicate para verificar se desconto � maior do que 0.2
       Predicate<Produto> desconto=prod1->prod1.desconto>=0.2?true:false;
       //Criando uma function Lambda do tipo  Predicate para verificar se o produto t�m frete gr�tis
       Predicate<Produto> freteGratis=prod2->prod2.freteGratis==true?true:false;
       //Criando uma Lambda do tipo Function que ir� receber um Produto e retorna uma String
       Function<Produto,String> superPromocao=prod3->"O produto "+prod3.produto+" est� com um super desconto de "+
                                                      prod3.desconto+" e frete gr�tis!";
       //Criando um Consumer que ir� receber uma refer�ncia para o m�todo System.out.println
       Consumer<String> println=System.out::println;
       /*Imprimindo em tela por meio de uma Stream e seus m�todos filter e map todos os produtos tenham desconto 
        * maior que 0.2% e frete gr�tis*/
       prod.stream().filter(desconto).filter(freteGratis).map(superPromocao).forEach(println);
    }
}
