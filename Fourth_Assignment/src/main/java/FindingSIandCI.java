import java.util.*;

public class FindingSIandCI 
{
	static Scanner sc=new Scanner(System.in);
	
	static int choiceMaking()
	{
		System.out.println("------------------------------------");
		System.out.println("Press 1 to calculate Simple Interest");
		System.out.println("Press 2 to calculate Compound Interest");
		int choice=sc.nextInt();
		return choice;		
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Interest Calculation");
		int choice=choiceMaking();
		String choice2="no";
		
		
		while(choice2.equalsIgnoreCase("no") || choice2.equalsIgnoreCase("n"))
		{
			if(choice == 1)
			{
				System.out.println("You have choose to calculate Simple Interest");
				System.out.println("Do you want to continue (yes or no)");
				choice2=sc.next();
				
				if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y"))
				{
					float principal_amount,rate_of_interest;
					int time_period;
					
					System.out.println();
					System.out.println("------------------------------Simple Interest------------------------------");
					
					System.out.println("Enter the principal amount on which the simple interest need to be calculated");
					principal_amount=sc.nextFloat();
					
					System.out.println("Enter the rate of interest");
					rate_of_interest=sc.nextFloat();
					
					System.out.println("Enter the time period required");
					time_period=sc.nextInt();	
					
					SimpleInterest simpleinterest=new SimpleInterest();
					
					float amount=simpleinterest.simpleInterest(principal_amount,rate_of_interest,time_period);
					
					System.out.println("Simple Interest of the give amount is: Rs"+amount+"/-");
					System.out.println("Total Amount: Rs"+(principal_amount+amount)+"/-");
				}
				else
				{
					choice=choiceMaking();
				}
			}
		
			if(choice == 2)
			{		
				System.out.println("You have choose to calculate Compound Interest");
				System.out.println("Do you want to continue (yes or no)");
				choice2=sc.next();
				
				if(choice2.equalsIgnoreCase("yes") || choice2.equalsIgnoreCase("y"))
				{
					float principal_amount,rate_of_interest;
					int time_period;
					
					System.out.println();
					System.out.println("------------------------------Compound Interest------------------------------");
					
					System.out.println("Enter the principal amount on which the Compound interest need to be calculated");
					principal_amount=sc.nextFloat();
					
					System.out.println("Enter the rate of interest");
					rate_of_interest=sc.nextFloat();
					
					System.out.println("Enter number of times the amount is compounded per year");
					int number_of_time_compounded=sc.nextInt();	
					
					System.out.println("Enter the time period required");
					time_period=sc.nextInt();
								
					CompoundInterest interest=new CompoundInterest();
					
					float amount=interest.compoundInterest(principal_amount,rate_of_interest,number_of_time_compounded,time_period);
					
					System.out.println("Compound Interest of the give amount is: Rs"+amount+"/-");
					System.out.println("Total Amount: Rs"+(principal_amount+amount)+"/-");
				}
				else
				{
					choice=choiceMaking();
				}
			}
			else
			{
				System.out.println("Invalid Choice");
				choice=choiceMaking();
			}
		}
		
		sc.close();
	
	}
}
