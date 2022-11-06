package oo.Heranca.TesteHeranca;

import oo.Heranca.Desafio.Carro;
import oo.Heranca.Desafio.Civic;
import oo.Heranca.Desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
	
	Carro civic = new Civic();
	Ferrari ferrari = new Ferrari();
	
	civic.Acelerar();
//	ferrari.Acelerar();
	
	ferrari.ligarTurbo();
	ferrari.ligarAr();
	ferrari.desligarTurbo();
	
	ferrari.Acelerar();
	
	System.out.println("Velocidade do Civic => " + civic.Velocidade + "Km/h");
	System.out.println("Velocidade da Ferrari => " + ferrari.Velocidade + "Km/h");
	
//	civic.Freiar();
//	ferrari.Freiar();
//
//	civic.Freiar();
//	ferrari.Freiar();
// 	
//	System.out.println();
//	System.out.println("Velocidade do Civic => " + civic.Velocidade + "Km/h");
//	System.out.println("Velocidade da Ferrari => " + ferrari.Velocidade + "Km/h");
	
	
	}
	

}
