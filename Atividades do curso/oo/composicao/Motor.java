package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInnjecao = 1;
	
	int giros() {
		if(!ligado){
			return 0;
		}
		else {
			return (int) Math.round(fatorInnjecao * 3000);
		}
	}

}
