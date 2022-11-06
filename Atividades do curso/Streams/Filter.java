package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabens " + a.nome + " voce foi aprovado(a)")
			.forEach(System.out::println);
	}

}
