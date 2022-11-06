package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(30 != 4);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		
		double nota = 6.9;
		boolean BomComportamento = true;
		boolean PassouPorMedia = nota >= 7;
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		
		System.out.println("Tem desconto? " + TemDesconto);
		
		
	}
	
	
	

}
