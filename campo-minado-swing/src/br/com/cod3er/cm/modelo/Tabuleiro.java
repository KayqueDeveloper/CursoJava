package br.com.cod3er.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Tabuleiro implements CampoObserver {
	
	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<Boolean>> observadores = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void paraCada(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registarObservador(Consumer<Boolean> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream()
			.forEach(o -> o.accept(resultado));
	}
	
	
	public void abrir(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.abrir());
	}
	

	public void marcar(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.alternarMarca());
	}


	private void gerarCampos() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				Campo campo = new Campo(l, c);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}

	private void associarVizinhos() {
		for (Campo campo : campos) {
			for (Campo c : campos) {
				campo.adicionarVizinho(c);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int)(Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
			
		} while (minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	@Override
	public void eventoOcorreu(Campo campo, CampoEvent evento) {
		if(evento == CampoEvent.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		}else if (objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}
	
	private void mostrarMinas() {
		campos.stream()
			.filter(c -> c.isMinado())
			.filter(c -> !c.isMarcado())
			.forEach(c -> c.setAberto(true));
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public int getMinas() {
		return minas;
	}
	
	
	
}
		



//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("  ");
//		for (int c = 0; c < colunas; c++) {
//			sb.append(" ");
//			sb.append(c);
//			sb.append(" ");
//		}
//		sb.append("\n");
//		
//		int i = 0;
//		for (int l = 0; l < linhas; l++) {
//			sb.append(l);
//			sb.append(" ");
//			for (int c = 0; c < colunas; c++) {
//				sb.append(" ");
//				sb.append(campos.get(i));
//				sb.append(" ");
//				i++;
//			}
//			sb.append("\n");
//		}
//		
//		return sb.toString();
//	}

















