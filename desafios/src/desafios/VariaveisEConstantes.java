package desafios;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		//(*f - 32) * 5/9 = °C
		
		final double  ajuste = -32;
		final double  conversor = 5/9.0;
		
		double  GrausF = 86;
		double  GrausC = (GrausF + ajuste) * conversor;
		System.out.println("°" + GrausF + "F = °" + GrausC + "C");
		
		GrausF =  150;
		GrausC = (GrausF + ajuste) * conversor;
		System.out.println("°" + GrausF + "F = °" + GrausC + "C");
	}
}
