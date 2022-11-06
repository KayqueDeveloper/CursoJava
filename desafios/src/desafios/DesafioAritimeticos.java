package desafios;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		//Math.pow
		
		// parte 1
		
		var a = 2 - 7;
		var b = 1 - 5;
		var c = a * b;
		var d = c / 2;
		var d2 = Math.pow(d, 2);
		
		// parte 2
		
		var e = 3 + 2;
		var f = 6 * e;
		var g = Math.pow(f, 2);
		var h = 3 * 2;
		var i = g / h;
		
		//System.out.println(d2 + "\n" + i);
		
		//parte 3
		
		var j = i - d2;
		var k = Math.pow(j, 3);
		var l = Math.pow(10, 3);
		
		//parte 4

		System.out.println(k / l);
		
	}

}
