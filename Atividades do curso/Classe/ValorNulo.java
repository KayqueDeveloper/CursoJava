package Classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data(10, 20, 2022) : null;
		
		if (d1 != null) {
			d1.dia = 3;
			System.out.println(d1.obter_data_formatada());
		}
		
		String s2 = Math.random() > 0.5 ? "opa" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("!!!!!!"));
		}
	
		
	}

}
