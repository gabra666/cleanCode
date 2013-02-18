package case3;

import case3.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		long sum = calculator.sum(1, 100);
		assertEquals(5050, sum);
	}
	
	@Test
	public void testSumOfSquares() {
		Calculator calculator = new Calculator();
		long sum = calculator.sumOfSquares(1, 10);
		assertEquals(385, sum);
	}
	
}
