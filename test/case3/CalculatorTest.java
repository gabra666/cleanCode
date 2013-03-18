package case3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
                Serie serie = new Serie(1,100);
                Function function = new addFunction();
		long sum = calculator.sum(serie,function );
		assertEquals(5050, sum);
	}
	
	@Test
	public void testSumOfSquares() {
		Calculator calculator = new Calculator();
                Serie serie = new Serie(1,100);
                Function function = new SquareFunction();
		long sum = calculator.sum(serie,function );
		assertEquals(338350, sum);
	}
	
}
