package Streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media()
				.adicionar(8.3)
				.adicionar(6.7);
		Media m2 = new Media()
				.adicionar(9.3)
				.adicionar(4.7);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
	}
}
