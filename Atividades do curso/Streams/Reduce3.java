package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Daniel", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, n1) -> media.adicionar(n1);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
			.filter(aprovado)
			.map(nota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A media do aluno é " + media.getValor());
		
	}

}
