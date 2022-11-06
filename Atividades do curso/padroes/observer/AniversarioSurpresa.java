package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		
	
	Namorada namorada = new Namorada();
	Porteiro porteiro = new Porteiro();

	
	porteiro.adicionarObservador(namorada);
	porteiro.adicionarObservador(o -> {
		System.out.println("Surpresa lambda  " + o.getMomento());
	});
	
	
	porteiro.monitorar();
	
	}

}
