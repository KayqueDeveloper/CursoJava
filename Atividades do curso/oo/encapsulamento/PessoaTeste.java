package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("kayque", 19);
		p1.setIdade(300);
		
		System.out.println(p1.toString());
		
	}

}
