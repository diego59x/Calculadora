

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = Calculadora.SingletonInstance();
	IStack<String> stack = new StackArrayList<String>();
	IStack<String> stack2 = new StackVector<String>();

	
	
	@Test
	public void testSumar() {
		int val1 = calc.sumar(7,3);
		int val2 = 10;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testRestar() {
		int val1 = calc.restar(10, 4);
		int val2 = 6;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testMultiplicar() {
		int val1 = calc.multiplicar(4, 5);
		int val2 = 20;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testDividir() {
		int val1 = calc.dividir(45, 5);
		int val2 = 9;
		assertEquals(val1, val2);
	}
	
	@Test
	public void testPop() {
		stack.push("Java");
		String val1 = stack.pop();
		String val2 = "Java";
		assertEquals(val1,val2);
		
		
	}
	
	@Test
	public void testSize() {
		stack.push("Java");
		stack.push("Test");
		int val1 = stack.size();
		int val2 = 2;
		assertEquals(val1,val2);
	}
	
	@Test
	public void testPop2() {
		stack2.push("Java");
		String val1 = stack2.pop();
		String val2 = "Java";
		assertEquals(val1,val2);
		
		
	}
	
	@Test
	public void testSize2() {
		stack2.push("Java");
		stack2.push("Test");
		int val1 = stack2.size();
		int val2 = 2;
		assertEquals(val1,val2);
	}

}
