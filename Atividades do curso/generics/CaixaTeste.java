package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> coisaA = new Caixa<>();
		coisaA.Guardar("Segredo!!");
		
		Caixa<Double> coisaB = new Caixa<>();
		coisaB.Guardar(3.1415);
		
		System.out.println(coisaA.Abrir());
		System.out.println(coisaB.Abrir());
	}
}
