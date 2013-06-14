package test.java.com.mycompany.app;
import main.java.com.mycompany.app.CalculadoraLib;
import junit.framework.TestCase;


public class CalculadoraTest extends TestCase {

	private CalculadoraLib calculadora =  new CalculadoraLib();

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSoma() { 
		assertEquals(15.0, calculadora.soma(5.0, 10.0));
	}
	
	public void testSubtracao() {
		assertEquals(15.0, calculadora.subtracao(30.0, 15.0));
	}
	
	public void testMultiplicacao() {
		assertEquals(15.0, calculadora.multiplicacao(3.0, 5.0));
	}
	
	public void testDiv() {
		assertEquals(3.0, calculadora.divisao(15.0, 5.0));
	}
	
}
