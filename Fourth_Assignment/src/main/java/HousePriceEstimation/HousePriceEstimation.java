package HousePriceEstimation;

import java.util.Scanner;

public class HousePriceEstimation 
{
	public static void main(String args[])
	{
		float area_of_house=0.0f;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.format("%s","------------------------House Price Estimation------------------------");
		
		System.out.format("\n%s\n","Enter the area of the house");
		area_of_house=sc.nextFloat();
		
		System.out.format("%s","Select the material \n1) Standard Material\n2) Above Standard Material\n3) High Standard Material\n 4)Fully Automated Home");
		int requirement=sc.nextInt();
		
		ConstructionCost cost=new ConstructionCost();
		
		float estimatedCost=cost.totalCost(area_of_house,requirement);
		
		System.out.format("%s %f","Estimated Cost of the house is: ",estimatedCost);
		
		
		
		sc.close();
		
	}

}
