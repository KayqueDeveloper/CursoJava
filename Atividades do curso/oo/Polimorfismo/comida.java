package oo.Polimorfismo;

public abstract class comida {
	
	private double peso;
	
	public comida(double peso) {
		setPeso(peso);
	}

	double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if ( peso >= 0) {
		this.peso = peso;
		}
	}

}
