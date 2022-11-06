package oo.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo, ligarAr;
	
	public Ferrari(){
		super(400);
		super.setDelta(15);
	}
	
	@Override
	public void Acelerar() {
		super.Acelerar();
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}
		if (!ligarTurbo && ligarAr) {
			return 10;
		}
		if (ligarTurbo && ligarAr) {
			return 30;
		}else {
		return 15;
		}
	}
	
	}

