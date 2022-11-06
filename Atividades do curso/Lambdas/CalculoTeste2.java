package Lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> {
			return x / y;
		};
		System.out.println(soma.executar(120, 8));
		
		Calculo multi = (x, y) -> x * y;
		System.out.println(multi.executar(2, 3));
	}

}
