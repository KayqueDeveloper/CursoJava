package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		

		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Bia", 5.1);
		Aluno a3 = new Aluno("Daniel", 5.1);
		Aluno a4 = new Aluno("Gui", 5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
	}

}
