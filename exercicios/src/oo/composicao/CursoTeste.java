package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
    	Curso curso=new Curso("POO");
    	curso.matricularAlunos(new Aluno("Michael Soares",888888,curso));
    	curso.matricularAlunos(new Aluno("Michael",55333,curso));
    	curso.matricularAlunos(new Aluno("Daniel",123433,curso));
    	curso.matricularAlunos(new Aluno("Rafael",324234324,curso));
    	Aluno a1=new Aluno("Daniel Sam",222333,new Curso("Francês"));
    	a1.cursos.add(new Curso("Informática"));
    	a1.cursos.add(new Curso("Matemática"));
    	a1.cursos.add(new Curso("Inglês"));
    	//a1.cursos.add(curso);
    	curso.matricularAlunos(a1);
    	curso.alunosMatriculados();
    	
    	for(Aluno aluno:curso.alunos) {
    		System.out.println("Sou o aluno: "+aluno.nome+" e faço os cursos: "+aluno.cursos);
    	}
    }
}
