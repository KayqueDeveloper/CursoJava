package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome,int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	//Getters
	public int getIdade() {
		return idade;
	}
	
	//Setters
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 150) {
		this.idade = novaIdade;
		}else {
			System.out.println("Idade ivalida!!!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Ola eu sou o " + nome + " e tenho " + idade + " anos";
	}
	
	
	
	

}
