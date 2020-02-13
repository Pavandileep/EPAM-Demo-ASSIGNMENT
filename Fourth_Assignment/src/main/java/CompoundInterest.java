import java.math.*;

public class CompoundInterest 
{
	public float compoundInterest(float principal_amount, float rate_of_interest,int number_of_times_compounded, int time_period)
	{
		float amount=0.0f;
		amount=(float) (principal_amount*(Math.pow(1+((rate_of_interest/100)/number_of_times_compounded), number_of_times_compounded*time_period)));
		
		
		return amount;
	}

}
