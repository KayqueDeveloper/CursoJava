package Classe;

public class ValorVSReferencia {
	public static void main(String[] args) {
		
	
	double a = 2;
	double b = a; //Atribuiçao por valor
	
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	Data d1 = new Data(1, 6, 2022);
	Data d2 = d1; // Atribuicao por referencia (Objeto)
	
	d1.dia = 31;
	d2.mes = 12;
	
	System.out.println(d1.obter_data_formatada());
	System.out.println(d2.obter_data_formatada());
	
	VoltarDataParaPadrao(d1);
	
	System.out.println(d1.obter_data_formatada());
	System.out.println(d2.obter_data_formatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	
	}
	
	static void VoltarDataParaPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
