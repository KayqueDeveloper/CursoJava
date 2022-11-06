package oo.Heranca.TesteHeranca;

import oo.Heranca.Direcao;
import oo.Heranca.Heroi;
import oo.Heranca.Jogador;
import oo.Heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Jogador Monstro = new Monstro();
		Monstro.x = 10;
		Monstro.y = 10;

		Jogador Heroi = new Heroi();
		Heroi.x = 10;
		Heroi.y = 10;
		
		Monstro.andar(Direcao.LESTE);
		
		System.out.println(Monstro.vida);
		System.out.println(Heroi.vida);

		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		System.out.println("O monstro tem => " + Monstro.vida);
		System.out.println("Heroi tem => " + Heroi.vida);
	}
	
	

}
