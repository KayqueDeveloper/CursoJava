package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObserver {

	void valorAlterado(String novoValor);
}
