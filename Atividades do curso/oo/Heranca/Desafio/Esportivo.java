package oo.Heranca.Desafio;

public interface Esportivo {
	
	void ligarTurbo();
	void desligarTurbo();
	
	default int nivelDoAr() {
		return 1;
	}

}
