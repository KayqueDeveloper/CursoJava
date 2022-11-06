package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		// short
		Short s = 1000;
		// int
		Integer i = 10000; // Integer.parseInt(entrada.next());
		// long
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 5);
		System.out.println(l / 5);

		// float
		Float f = 123.10F;
		System.out.println(f.intValue());
		// double
		Double d = 1234.5678;
		System.out.println(d.doubleValue());

		// Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		// char
		Character c = '#';
		System.out.println(c.toString().toLowerCase());

		// entrada.close();

	}

}
