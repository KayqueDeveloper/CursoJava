package Lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo somar = new Soma();
		System.out.println(somar.executar(2, 3));
	
		Calculo multi = new Multiplicar();
		System.out.println(multi.executar(2, 3));
	}

}
