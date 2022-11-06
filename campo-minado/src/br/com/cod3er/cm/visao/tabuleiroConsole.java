package br.com.cod3er.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3er.cm.excecao.copy.ExplosaoException;
import br.com.cod3er.cm.excecao.copy.SairException;
import br.com.cod3er.cm.modelo.Tabuleiro;

public class tabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	Scanner entrada = new Scanner(System.in);

	public tabuleiroConsole(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;

		executarJogo();
	}
	
	public void executarJogo() {
		try {
			boolean continuar = true;
			
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? ");
				String resposta = entrada.nextLine();
				
				if (resposta.trim().equalsIgnoreCase("n")) {
					continuar = false;
				}else {
					tabuleiro.reiniciar();
				}
				
			}
			
		} catch (SairException e) {
			System.out.println("Tchau...");
		}finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (X, Y): ");
			
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 - Abrir / 2 - (Des)Marcar: ");

				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if ("2".equals(digitado)) {
					tabuleiro.marcar(xy.next(), xy.next());
				}
			
			}
			
			System.out.println(tabuleiro);
			System.out.println("Voce ganhou!!");
			
		} catch (ExplosaoException e) {
				System.out.println(tabuleiro);
				System.out.println("Voce perdeu!!");;
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}

}
























