package excecao.personalizadaB;

public class StringVaziaException extends Exception {
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' esta vazio", nomeDoAtributo);
	}

}
