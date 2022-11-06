package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("ÓLa Pessoal".charAt(2));
		
		String s = "Boa tarde";
		// s = s.toUpperCase();
		
		System.out.println(s.concat("!!"));
		System.out.println(s +"!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s
				.toLowerCase()
				.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome =  "Santos";
		var idade = 33;
		var salario = 12345.987;
		
	    System.out.println("Nome: " + nome + "  " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario + "\n\n");
	    
	    System.out.printf("o senhor %s %s tem %d de idade, e \n ganha cerca de R$ %.2f", nome, sobrenome, idade, salario);
	    
	    String frase = String.format("o senhor %s %s tem %d de idade, e \n ganha cerca de R$ %.2f", nome, sobrenome, idade, salario);
	    System.out.println(frase);
	    
	    // %s para strings
	    // %d para inteiros
	    // %f para flutuantes
		
		
	}

}
