
public class ConstructionCost 
{
	float totalCost(float area_of_house,int requirement)
	{
		float estimatedCost=0.0f;
		float cost_per_area=0.0f;
		
		switch(requirement)
		{
			case 1:
				cost_per_area=1200;
				break;
			case 2:
				cost_per_area=1500;
				break;
			case 3:
				cost_per_area=1800;
				break;
			case 4:
				cost_per_area=2500;
				break;
			default:
				System.out.format("%s", "Invalid  requirement");
				break;
		}
		
		estimatedCost=area_of_house*cost_per_area;
		
		return estimatedCost;
	}

}
