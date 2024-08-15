package excecao;

import streams.Aluno;

public class basico {
	public static void main(String[] args) {
		Aluno a1 = null;
		
		try {
			imprimirNomedoAluno(a1);
		} catch (Exception e) {
			
			System.out.println("Ocorreu um erro "+e.getMessage());
		}
		
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {

			System.out.println("Ocorreu um erro "+e.getMessage());
		}
		
		System.out.println("Fimm !!!");

	}
	
	public static void imprimirNomedoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
		

}
