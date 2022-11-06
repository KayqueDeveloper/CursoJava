package padroes.observer;

public class Namorada implements ChegadaObservador {

	@Override
	public void chegou(EventoChegada evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar");
		System.out.println("e... SURPRESA!!!");
		
	}
}
