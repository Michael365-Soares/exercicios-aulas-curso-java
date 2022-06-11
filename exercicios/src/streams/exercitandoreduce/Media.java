package streams.exercitandoreduce;

public class Media {
     double notas;
     double quantidade;
     
     public Media adicionar( double nota) {
    	 this.notas+=nota;
    	 this.quantidade++;
    	 return this;
     }
     
     public double getValor() {
    	 return this.notas/this.quantidade;
     }
     
     public static Media combinador(Media m1,Media m2) {
    	 Media resultante=new Media();
    	 resultante.notas=m1.notas+m2.notas;
    	 resultante.quantidade=m1.quantidade+m2.quantidade;
    	 return resultante;
     }
}
