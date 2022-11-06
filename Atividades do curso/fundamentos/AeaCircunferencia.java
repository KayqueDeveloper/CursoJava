package fundamentos;

public class AeaCircunferencia {
	
	public static void main(String[] args) {
       double raio = 3.4;
        final  double PI = 3.141559;
       // final deixa o valor inalteravel
        
       double area = raio * raio  * PI;
       System.out.println(area);
       
       raio = 10;
       area = PI * raio * raio;
       System.out.println("area = " + area + "m².");
	}

}
