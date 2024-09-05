package unit_003_if;

public class U3_L5_ShortCircuitEvaluation
{

	public static void main(String[] args)
	{
		String name = "joe";
		String mood = "happy";
		
		if(name.equalsIgnoreCase("Helen") && mood.equalsIgnoreCase("happy"))
		{
			System.out.println("They are both true.");
		}
		else
		{
			System.out.println("One of them i not true!!");
		}
		
		int x = 3;
		int y = 6;
		
		if(x < 5 && y != 3)
		{
			System.out.println("x < 5, y is not 3");
		}
		
		x = 100;
		y = 3;
		
		if(x < 5 && y != 3)
		{
			System.out.println("second statement x < 5, y is not 3");
		}
		
		if (x >= 0 || y == 100)
		{
			System.out.println("One of these is true.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
