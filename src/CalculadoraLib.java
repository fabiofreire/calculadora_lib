import org.apache.log4j.Logger;


public class CalculadoraLib {

	static Logger log4j = Logger.getLogger("test");
	
	public double soma(double a, double b) {
		log4j.warn("Low fuel level.");
		return a + b;
	}


	public double subtracao(double a, double b) {
		return a - b;
	}


	public double multiplicacao(double a, double b) {
		return a * b;
	}


	public double divisao(double a, double b) {
		return a / b;
	}
}
