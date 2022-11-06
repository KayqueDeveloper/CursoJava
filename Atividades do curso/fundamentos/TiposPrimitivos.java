package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
		
		// tipos numericos inteiros
		byte AnosDeEmpresa = 23;
		short NumerosDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_234_845_223L; // se passar da capacidade de int é prciso colocar L no final
		
		// tipos numericos reais
		float Salario = 11_445.44F; // para float preciso colocar F no final
		double VendasAcumuladas = 2_991_797_103.01;
		
		//tipo boleano
		boolean EstarDeFerias = false;// ou true
		
		// tipo caractere
		char status = 'A'; // ativo7
		
		// dias de empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//numeros de viagens
		System.out.println(NumerosDeVoos / 2);
		
		//pontos por real	
		System.out.println(PontosAcumulados / VendasAcumuladas);
		
		System.out.println(id + " ganha -->" + Salario);
		System.out.println("ferias? " + EstarDeFerias);
		System.out.println("Status " + status);
		
		
	}

}
