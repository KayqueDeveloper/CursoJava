package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt coisaA = new CaixaInt();
		coisaA.Guardar(123);
		
		Integer coisa = coisaA.Abrir();
		System.out.println(coisa);
	}
}
