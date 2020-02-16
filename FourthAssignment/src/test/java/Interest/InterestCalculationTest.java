package Interest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InterestCalculationTest {

	
	InterestCalculation interest;
	@Before
	public void createObject()
	{
		interest=new InterestCalculation();
	}
	
	@Test
	public void simpleInterestTest() 
	{
		assertEquals("Simple Interest of the given amount is :",11500.0,interest.simpleInterest(10000.0f,5.0f,3),0.0f);
	}
	
	@Test
	public void compoundInterestTest() 
	{
		assertEquals("Compound Interest of the given amount is :",21576.248046875,interest.compoundInterest(10000.0f,5.0f,1,3),0.0f);	
	}

}
