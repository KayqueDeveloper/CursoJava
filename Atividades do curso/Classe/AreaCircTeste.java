package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
//		a.pi = 10;
		
		AreaCirc a1 = new AreaCirc(5);
		
		System.out.println(a.area());
		System.out.println(a1.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
