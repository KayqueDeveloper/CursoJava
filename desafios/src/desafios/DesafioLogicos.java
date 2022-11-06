package desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
	 
		boolean comprou50 = trabalho1 && trabalho2;
		boolean comprou32 = trabalho1 ^ trabalho2;
		boolean tomousorvete = trabalho1 || trabalho2;
		
		System.out.println("Commprou a TV de 50'?" + comprou50);
		System.out.println("Commprou a TV de 32" + comprou32);
		System.out.println("Tomou Sorvete ?" + tomousorvete);
		
		// operador unario
		System.out.println("Mais saudavel? " + !tomousorvete);
		
		
	}

}



