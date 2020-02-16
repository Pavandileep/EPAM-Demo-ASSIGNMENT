package ConstructionCost;

public class ConstructionCost 
{
	float totalCost(float area_of_house,String materialType)
	{
		float estimatedCost=0.0f;
		float cost_per_area=0.0f;
		Materials material = null;
		
		if(materialType.equals("StandardMaterial"))
			material=new StandardMaterial();
		else if(materialType.equals("AboveStandardMaterial"))
			material=new AboveStandardMaterial();
		else if(materialType.equals("HighStandardMaterial"))
			material=new HighStandardMaterial();
		else if(materialType.equals("FullyAutomated"))
			material=new FullyAutomated();
		
		estimatedCost=material.totalConstructionCost(area_of_house);
		
		return estimatedCost;
	}

}
