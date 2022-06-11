package fundamentos.operadores;

public class OperadorTernario {
   public static  void main(String[] args) {
	   float media =8.0F;
	   String resultado= media >= 7.0 ? "Aluno aprovado!":"Aluno reprovado!";
	   System.out.println(resultado);
	   int idade=17;
	   String cidadaoAtivo= idade < 18 ?"Não é cidadão ativo!":
	   idade >= 16 && idade < 18 ?"Voto facultativo":"É cidadão ativo!";
	   System.out.println("Estado de cidadania e alistamento eleitoral: "+cidadaoAtivo);
   }
}
