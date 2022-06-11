package oo.polimorfismo;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pessoa {
    private String nome;
    private double peso;
    private Deque<Comida> refeicao=new ArrayDeque<>();
    DecimalFormat fmt=new DecimalFormat("0.##");
    
    Pessoa(String nome,double peso){
    	setNome(nome);
    	setPeso(peso);
    }
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(this.peso>=0&&this.peso<=160) {
		   this.peso = peso;
		}else {
			this.peso=0;
		}
	}
	
	public Deque<Comida> montarRefeicao(Comida comida) {
		 refeicao.add(comida);
		 return refeicao;
	}
	
	 public void comer(Deque<Comida> refeicao) {
		 for(Comida comida:refeicao) {
			 this.peso+=comida.calorias;
			 fmt.format(this.peso);
		 }
	 }
	 
	 public String toString() {
		 return "Olá eu sou o "+getNome()+" e peso "+fmt.format(getPeso())+" Kg;";
	 }
}
