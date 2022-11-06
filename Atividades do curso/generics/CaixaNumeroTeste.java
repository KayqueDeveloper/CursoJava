package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> coisaA = new CaixaNumero<>();
		coisaA.Guardar(2.3);
		CaixaNumero<Integer> coisaB = new CaixaNumero<>();
		coisaB.Guardar(2);
		
		Double coisa1 = coisaA.Abrir();
		Integer coisa2 = coisaB.Abrir();
		System.out.println(coisa1 + "\n" + coisa2);
	}
}
