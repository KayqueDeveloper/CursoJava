package Classe;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Comida("arroz", 0.3);
		Comida feijao = new Comida("feijao", 0.4);
		Pessoa kayque = new Pessoa("kayque", 90);
		
		
		System.out.printf("Antes de comer kayque pesava %.1fKg", kayque.peso);
		kayque.comer(arroz);
		System.out.printf("\nDepois de comer arroz ficou pesando %.1fKg e", kayque.peso);
		kayque.comer(feijao);
		System.out.printf("\ndepois comer arroz e feijao ficou pesando %.1fKg", kayque.peso);
		
		
		
	}

}
