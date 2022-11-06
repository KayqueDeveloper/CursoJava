package oo.composicao;

public class carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		if(motor.fatorInnjecao < 2.6)
		motor.fatorInnjecao += 0.4;
	}
	
	void freiar() {
		if(motor.fatorInnjecao > 0.5) {
			motor.fatorInnjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean esta_ligado() {
		return motor.ligado;
	}

}
