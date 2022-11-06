package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("a ", "b ", "c ", "d\n");
		langs.forEach(print);
		
		String[] maisLangs = { "A ", "B ", "C ", "D\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("x ", "y ", "z");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print);       vai gerar letra A sem parar
//		Stream.iterate(0, n -> n + 1).forEach(print);    vai acrescentar 1 desde o 0 (semente/seed)
	}
}
