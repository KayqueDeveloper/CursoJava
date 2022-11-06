package br.com.cod3er.cm.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Campo {
	
	public static final String ANSI_RED = "\u001B[4m";
	public static final String ANSI_BLACK = "\u001B[0m";
	
	private final int coluna;
	private final int linha;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private Set<CampoObserver> observadores = new HashSet<>();

	public Campo(int linha, int coluna) {
		super();
		this.coluna = coluna;
		this.linha = linha;
	}
	
	public void registrarObservador(CampoObserver observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvent evento) {
		observadores.stream()
			.forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	public boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente, colunaDiferente, diagonal;
		
		linhaDiferente = linha != vizinho.linha;
		colunaDiferente = coluna != vizinho.coluna;
		diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha, deltaColuna, deltaGeral;
		
		deltaLinha = Math.abs(linha - vizinho.linha);
		deltaColuna = Math.abs(coluna - vizinho.coluna);
		deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
	}
	
	public void alternarMarca() {
		if (!aberto) {
			marcado = !marcado;
			
			if (marcado) {
				notificarObservadores(CampoEvent.MARCAR);
			}else {
				notificarObservadores(CampoEvent.DESMARCAR);
			}
		}
	}
	
	public boolean abrir() {
		
		if (!aberto && !marcado) {
			aberto = true;
			
			if (minado) {
				notificarObservadores(CampoEvent.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		}else {
			return false;
		}
	}

	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public void minar() {
		if(!minado) {
			minado = true;
		}
	}

	public boolean isMarcado() {
		return marcado;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	public boolean isMinado() {
		return minado;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
		if (aberto) {
			notificarObservadores(CampoEvent.ABRIR);
			
		}
	}

	public void setMinado(boolean minado) {
		this.minado = minado;
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}

	public boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	public int minasNaVizinhanca() {
		return (int)vizinhos.stream().filter(v -> v.minado).count();
	}
	
	public void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvent.REINICIAR);
	}
	
}











