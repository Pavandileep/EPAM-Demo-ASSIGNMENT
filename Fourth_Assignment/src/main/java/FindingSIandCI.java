import java.util.*;

public class FindingSIandCI 
{
	static Scanner sc=new Scanner(System.in);
	
	static int choiceMaking()
	{
		System.out.format("%s","------------------------------------\n");
		System.out.format("%s","Press 1 to calculate Simple Interest\n");
		System.out.format("%s","Press 2 to calculate Compound Interest\n");
		int choice=sc.nextInt();
		return choice;		
	}
	
	public static void main(String args[])
	{
		System.out.format("%s","Welcome to Interest Calculation\n");
		int choice=choiceMaking();
		String choice2="no";
		
		
		while(choice2.equalsIgnoreCase("no") || choice2.equalsIgnoreCase("n"))
		{
			if(choice == 1)
			{
				System.out.format("%s","You have choose to calculate Simple Interest\n");
				System.out.format("%s","Do you want to continue (yes or no)\n");
				choice2=sc.next();
				
				if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y"))
				{
					float principal_amount,rate_of_interest;
					int time_period;
					
					System.out.format("\n%s","------------------------------Simple Interest------------------------------\n");
					
					System.out.format("%s","Enter the principal amount on which the simple interest need to be calculated\n");
					principal_amount=sc.nextFloat();
					
					System.out.format("%s","Enter the rate of interest\n");
					rate_of_interest=sc.nextFloat();
					
					System.out.format("%s","Enter the time period required\n");
					time_period=sc.nextInt();	
					
					SimpleInterest simpleinterest=new SimpleInterest();
					
					float amount=simpleinterest.simpleInterest(principal_amount,rate_of_interest,time_period);
					
					System.out.format("%s","Simple Interest of the give amount is: Rs"+amount+"/-\n");
					System.out.format("%s","Total Amount: Rs"+(principal_amount+amount)+"/-\n");
				}
				else
				{
					choice=choiceMaking();
				}
			}
		
			else if(choice == 2)
			{		
				System.out.format("%s","You have choose to calculate Compound Interest\n");
				System.out.format("%s","Do you want to continue (yes or no)\n");
				choice2=sc.next();
				
				if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y"))
				{
					float principal_amount,rate_of_interest;
					int time_period;
					
					System.out.format("\n%s","------------------------------Compound Interest------------------------------\n");
					
					System.out.format("%s\n","Enter the principal amount on which the Compound interest need to be calculated");
					principal_amount=sc.nextFloat();
					
					System.out.format("%s\n","Enter the rate of interest");
					rate_of_interest=sc.nextFloat();
					
					System.out.format("%s","Enter number of times the amount is compounded per year\n");
					int number_of_time_compounded=sc.nextInt();	
					
					System.out.format("%s\n","Enter the time period required");
					time_period=sc.nextInt();
								
					CompoundInterest interest=new CompoundInterest();
					
					float amount=interest.compoundInterest(principal_amount,rate_of_interest,number_of_time_compounded,time_period);
					
					System.out.format("%s\n","Compound Interest of the give amount is: Rs"+amount+"/-");
					System.out.format("%s\n","Total Amount: Rs"+(principal_amount+amount)+"/-");
				}
				else
				{
					choice=choiceMaking();
				}
			}
			
			else
			{
				System.out.format("%s\n","Invalid Choice");
				choice=choiceMaking();
			}
		}
		
		sc.close();
	
	}
}
