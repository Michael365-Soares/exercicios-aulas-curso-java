package streams;

public class Media {
     double nota;
     double quantidade;
     
     /*M�todo respons�vel por receber as notas como par�metros e ir somando uma com a outra
      * e toda vez que o mesmo for chamado adicionando o contador quantidade  em mais 1 juntamente
      * retornando ao final uma inst�ncia do pr�prio objeto para encadeamento de chamadas
      * */
     public Media adicionar(double nota) {
    	 this.nota+=nota;
    	 quantidade++;
    	 return this;
     }
     
     //Met�do respons�vel por retornar a m�dia das notas passadas para o m�todo adicionar()
     public double getValor() {
    	 return this.nota/this.quantidade;
     }
     
     /*Criando um m�todo respons�vel por receber duas notas de dois objetos diferente e conbin�-las
      * */
     public static Media combinador(Media m1,Media m2) {
    	 Media resultado=new Media();
    	 resultado.nota+=m1.nota;
    	 resultado.nota+=m2.nota;
    	 resultado.quantidade+=m1.quantidade;
    	 resultado.quantidade+=m2.quantidade;
    	 return resultado;
     }
}
