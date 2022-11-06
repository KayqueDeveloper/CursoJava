package desafios_metodos;

public class Data {
	int dia, ano, mes;
	
	Data() {
//		dia = 01;
//		mes = 01;
//		ano = 1970;
//		this(1, 1, 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obter_data_formatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void ImprimirDataFormatada() {
		System.out.printf("\n%d/%d/%d", dia, mes, ano);
	}
	
}
