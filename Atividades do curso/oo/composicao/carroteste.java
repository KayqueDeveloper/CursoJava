package oo.composicao;

public class carroteste {
	public static void main(String[] args) {
		
		carro c = new carro();
		System.out.println(c.esta_ligado());
		
		c.ligar();
		System.out.println(c.esta_ligado());
		System.out.println(c.motor.giros());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		c.freiar();
		c.freiar();
		c.freiar();
		c.freiar();
		
		System.out.println(c.motor.giros());
	}

}
