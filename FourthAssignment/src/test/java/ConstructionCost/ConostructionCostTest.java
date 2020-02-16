package ConstructionCost;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConostructionCostTest {

	@Test
	public void test() 
	{
		ConstructionCost cost=new ConstructionCost();
		assertEquals("Construction Cost is:",62500.0,cost.totalCost(25,"FullyAutomated"),0.0f);
		
	}

}
