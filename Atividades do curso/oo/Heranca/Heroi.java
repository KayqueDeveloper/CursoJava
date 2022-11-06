package oo.Heranca;

public class Heroi extends Jogador{
	
	public boolean atacar(Jogador oponente) {
		boolean atacar1 = super.atacar(oponente);
		boolean atacar2 = super.atacar(oponente);
		boolean atacar3 = super.atacar(oponente);
		return atacar1 || atacar2 || atacar3;
	}
	
//	boolean atacar(Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 20;
//			return true;
//		}
//		else if (deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		}
//		else
//			return false;
//	}

}
