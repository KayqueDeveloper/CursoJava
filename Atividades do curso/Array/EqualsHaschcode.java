package Array;

public class EqualsHaschcode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("dd");
		u1.nome = "Pedro Silva";
		u1.email = "kayquedev.@hotmal.com";
		
		Usuario u2 = new Usuario("de");
		u2.nome = "Pedro Silva";
		u2.email = "kayquedev.@hotmal.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
		
		
	}

}
