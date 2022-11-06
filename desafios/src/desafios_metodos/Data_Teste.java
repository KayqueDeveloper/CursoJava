package desafios_metodos;

public class Data_Teste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data(18, 9, 2022);
		
//		System.out.printf(d1.obter_data_formatada());
//		System.out.printf("\n" + d2.obter_data_formatada());
		
		d1.ImprimirDataFormatada();
		d2.ImprimirDataFormatada();
		
		
		
		
	}
}
