package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ChegadaObservador> observadores = new ArrayList<>();
	
	public void adicionarObservador(ChegadaObservador observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
		
		while(!valor.equals("sair")) {
			System.out.print("Aniversariante chegou? ");
			valor = entrada.nextLine();
			
			if (valor.trim().equalsIgnoreCase("sim")) {
				EventoChegada evento = new EventoChegada(new Date());
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				
				valor = "sair";
			}else {
				System.out.println("Alarme falso!");
			}
		}

		entrada.close();
	}

}
