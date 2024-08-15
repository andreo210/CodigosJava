package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniela", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Osmar", 8.8);
		Aluno a7 = new Aluno("Ana", 7.8);
		Aluno a8 = new Aluno("Bia", 5.8);
		Aluno a9 = new Aluno("Daniela", 9.8);
		Aluno a10 = new Aluno("Gui", 6.8);
		Aluno a11 = new Aluno("Rebeca", 7.1);
		Aluno a12 = new Aluno("Osmar", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12);
		
		System.out.println("Distincts ....");
		alunos.stream().distinct().forEach(System.out::println);//pega os elementos sem repetição, mas precisa do hascode e o equals
		

		System.out.println("\n Skip / limits ....");
		alunos.stream()
			.distinct()
			.skip(2)//pega a parti de 2
			.limit(2)//com limite de 2 elementoso
			.forEach(System.out::println);
		
		System.out.println("\n takeWhile ....");
		alunos.stream()
			.distinct()
			.skip(2)//pega a parti de 2
			.takeWhile(a-> a.nota >=7)//pega enquanto nota é maior que 7
			.forEach(System.out::println);
	}

}
