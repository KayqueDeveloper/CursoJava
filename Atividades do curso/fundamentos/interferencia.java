package fundamentos;

public class interferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c =  "Outro texto";
		System.out.println(c);
		
		//c = 4;
		// Não posso mudar o tipo da variavel
		
		double d; //variavel declarada
		d= 123.65; // variavel inicialização
		System.out.println(d);  // variavel executada
		
		//var e;
		//e = 123.65
		// nao posso usar com var
		
	//	var f = 12; //inteiro
		//f = 12.01 // decimal
		// nao posso udar de int para decimal
				
	}

}
