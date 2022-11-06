package oo.Heranca.Desafio;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	public int Velocidade;
	private int delta = 5;
	
	
	protected  Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void Acelerar() {
		if (Velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			Velocidade = VELOCIDADE_MAXIMA;
		}else {
			Velocidade += getDelta();
		}
	}

	
	public void Freiar() {
		if (Velocidade >= 5) {
			Velocidade -= 5;
		}else
			Velocidade = 0;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
