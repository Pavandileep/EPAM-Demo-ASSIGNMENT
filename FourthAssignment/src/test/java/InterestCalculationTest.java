import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculationTest {

	@Test
	public void test() {
		InterestCalculation interest=new InterestCalculation();
		
		assertEquals("Simple Interest of the given amount is :",1500.0,interest.simpleInterest(10000.0f,5.0f,3),0.0f);
		assertEquals("Compound Interest of the given amount is :",11576.248046875,interest.compoundInterest(10000.0f,5.0f,1,3),0.0f);
		
	}

}
