package oo.composição;

public class CursoTEST {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Maria");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("João");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("C#");
		Curso curso3 = new Curso("PHP");
		
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno1);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso "+curso3.nome+ "");
			System.out.println("e meu nome é "+aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoNome("Java");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
