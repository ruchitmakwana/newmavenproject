import org.junit.Assert;
import org.junit.Test;

import com.cg.bean.Calculator;


public class TestCalculator 
{
	@Test
	public void test_add()
	{
		Calculator calc= new Calculator();
		int res= calc.add(3, 4);
		Assert.assertEquals(7, res);
	}
	@Test
	public void test_subtract()
	{
		Calculator calc= new Calculator();
		int res= calc.subtract(6, 2);
		Assert.assertEquals(2, res);
	}
	@Test
	public void test_multiply()
	{
		Calculator calc= new Calculator();
		int res= calc.add(3, 4);
		Assert.assertEquals(12, res);
	}
	@Test
	public void test_sqaure()
	{
		Calculator calc= new Calculator();
		int res= calc.calcSquare(3);
		Assert.assertEquals(9, res);
	}
	
}

