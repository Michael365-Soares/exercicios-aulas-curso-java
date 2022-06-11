package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
    	//Posicionamentos
    	Jogador monstro=new Monstro(10,10,"Ogro");
    	monstro.andar(Direcao.NORTE);  
    	monstro.andar(Direcao.NORTE);  
    	monstro.andar(Direcao.NORTE);  
    	monstro.andar(Direcao.NORTE); 
    	monstro.andar(Direcao.NORTE);
    	monstro.andar(Direcao.LESTE);
    	//Posicionamentos
    	Heroi heroi=new Heroi(10,10,"Homem-Aranha");
    	heroi.andar(Direcao.NORTE);   
    	heroi.andar(Direcao.NORTE);  
    	heroi.andar(Direcao.NORTE); 
    	heroi.andar(Direcao.NORTE); 
    	heroi.andar(Direcao.LESTE); 
    	//Ataques
    	monstro.atacar(heroi);
    	heroi.atacar(monstro);
    	
    	System.out.println(monstro.getLinha()+" = J1 LINHA");
    	System.out.println(monstro.getColuna()+" = J1 COLUNA");
    	System.out.println(monstro.getNome()+" tem "+monstro.getVida()+" de vida.");
    	System.out.println("=========================================");
    	System.out.println(heroi.getLinha()+" = J2 LINHA");
    	System.out.println(heroi.getColuna()+" = J2 COLUNA");
    	System.out.println(heroi.getNome()+" tem "+heroi.getVida()+" de vida.");
    }
}
