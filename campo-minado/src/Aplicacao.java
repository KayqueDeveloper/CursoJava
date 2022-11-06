import br.com.cod3er.cm.modelo.Tabuleiro;
import br.com.cod3er.cm.visao.tabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 15);
		new tabuleiroConsole(tabuleiro);

	}

}
