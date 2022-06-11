package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public final String nome;
    public int matricula;
    final List<Curso> cursos=new ArrayList<>();
    
    //Aluno(){}
    public Aluno(String nome,int matricula,Curso curso) {
    	this.nome=nome;
    	this.matricula=matricula;
    	curso.alunos.add(this);
   }
   
   public void adicionarCurso(Curso curso) {
	   cursos.add(curso);
	   curso.alunos.add(this);
   }
   
}
