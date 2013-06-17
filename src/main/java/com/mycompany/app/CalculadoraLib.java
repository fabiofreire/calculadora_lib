package main.java.com.mycompany.app;
import org.apache.log4j.Logger;


public class CalculadoraLib {

	static Logger log4j = Logger.getLogger("test");
	
	public int soma(int a, int b) {
		log4j.warn("Low fuel level.");
		return a + b + 2;
	}


	public int subtracao(int a, int b) {
		return a - b;
	}


	public int multiplicacao(int a, int b) {
		return a * b;
	}


	public int divisao(int a, int b) {
		return a / b;
	}
}
