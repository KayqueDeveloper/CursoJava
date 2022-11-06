package fundamentos.operadores;

public class Ternnario {
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7 ? "Aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 8.6;
		boolean BomComportamento = true;
		boolean PassouPorMedia = nota >= 7;
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		String resultado = TemDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado);
	}

}
