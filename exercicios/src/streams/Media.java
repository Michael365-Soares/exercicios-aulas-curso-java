package streams;

public class Media {
     double nota;
     double quantidade;
     
     /*Método responsável por receber as notas como parâmetros e ir somando uma com a outra
      * e toda vez que o mesmo for chamado adicionando o contador quantidade  em mais 1 juntamente
      * retornando ao final uma instância do próprio objeto para encadeamento de chamadas
      * */
     public Media adicionar(double nota) {
    	 this.nota+=nota;
    	 quantidade++;
    	 return this;
     }
     
     //Metódo responsável por retornar a média das notas passadas para o método adicionar()
     public double getValor() {
    	 return this.nota/this.quantidade;
     }
     
     /*Criando um método responsável por receber duas notas de dois objetos diferente e conbiná-las
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
