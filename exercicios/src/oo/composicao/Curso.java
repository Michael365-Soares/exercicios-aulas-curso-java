package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos=new ArrayList<>();
    
    public Curso(String nomeCurso) {
    	this.nome=nomeCurso;
    }
    public void matricularAlunos(Aluno aluno) {
    	alunos.add(aluno);
    	aluno.cursos.add(this);
    }
    
    public String toString() {
    	return ""+this.nome;
    }
    public void alunosMatriculados() {
    	for(Aluno aluno:alunos) {
    		System.out.println("Nome: "+aluno.nome);
    		System.out.println("Matricula: "+aluno.matricula);
    		System.out.println("Curso: "+aluno.cursos.toString());
    	}
    }
}
