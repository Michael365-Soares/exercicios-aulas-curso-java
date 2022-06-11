package classe;

public class Usuario {
   String nome;
   String email;
   public Usuario(String nome,String email) {
	   this.nome=nome;
	   this.email=email;
   }
   public Usuario() {}
   public boolean equals(Object objeto){
	   if(objeto instanceof Usuario) {
	     Usuario u1=(Usuario) objeto;
	     boolean nomeIgual =u1.nome.equals(this.nome);
	     boolean emailIgual=u1.email.equals(this.email);
	     boolean comparacao=nomeIgual&&emailIgual;
	     return comparacao;
	   }
	   return false;
   }
}
