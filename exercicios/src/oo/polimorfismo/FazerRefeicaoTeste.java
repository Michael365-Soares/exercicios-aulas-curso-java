package oo.polimorfismo;

import java.util.Deque;

public class FazerRefeicaoTeste {
   public static void main(String[] args) {
	   Pessoa p1=new Pessoa("Michael",65.0);
	   p1.montarRefeicao(new Cereal(0.200,"Arroz"));
	   p1.montarRefeicao(new Cereal(0.200,"Feijão"));
	   p1.montarRefeicao(new Proteina(0.400,"Arroz"));
	   p1.montarRefeicao(new Proteina(0.5,"Lasanha"));
	   Deque<Comida> refeicao=p1.montarRefeicao(new Verdura(0.500,"Salada"));
	   System.out.println(p1);
	   p1.comer(refeicao);
	   System.out.println(p1);
   }
}
