package Classe;

public class Data {
	int dia, ano, mes;
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obter_data_formatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void ImprimirDataFormatada() {
		System.out.printf("\n%d/%d/%d", dia, mes, ano);
	}
	
}
