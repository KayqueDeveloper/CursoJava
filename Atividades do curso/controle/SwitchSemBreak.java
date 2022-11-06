package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "marrom";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai");
		case "marrom":
			System.out.println("Sei o Tekki shodan");
		case "roxa":
			System.out.println("sei o heian godan");
		case "verde":
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
			break;
		default:
			System.out.println("nao sei de nada");
		}
		
		System.out.println("fim");

	}
}
