package Lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default double extecutor() {
		return executar(0,0);
	}
}
