import static org.junit.Assert.*;

import org.junit.Test;

public class ConostructionCostTest {

	@Test
	public void test() 
	{
		ConstructionCost cost=new ConstructionCost();
		assertEquals("Construction Cost is:",37500.000000,cost.totalCost(25,2),0.0f);
		
	}

}
