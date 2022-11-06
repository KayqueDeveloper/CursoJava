package padroes.observer;

import java.util.Date;

public class EventoChegada {
	
	private final Date momento;

	public EventoChegada(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
}
