package unit_004_iteration;


public class U4_L3_ForLoops
{


	public static void main(String[] args)
	{
		int x = 1;
		
		while(x <= 5)
		{
			System.out.println("x is " + x);
			x++;
		}
		
		System.out.println("\n\n");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("i is " + i);
		}
		
		
		//write a loop that will output only the even numbers from 1 -100
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.printf("%-3d", i);
			}
		}
		System.out.println("\n\n");
		//solution to making a calendar view
		int counter = 1;
		for(int i = 2; i <= 100; i +=2)
		{
			if(counter <= 5)
			{
				System.out.printf("%-4d", i);
				counter++;
			}
			
			if(counter > 5)
			{
				System.out.println();
				counter = 1;
			}
			
		}
		
		//solution B
		System.out.println("\n\n");
		for(int i = 2; i <= 100; i+=2)
		{
			if(i % 10 == 0)
			{
				System.out.printf("%-4d", i);
				System.out.println();
				i += 2;
				
				if(i > 100)
				{
					break;
				}
			}
			
			if(!(i % 10 == 0))
			{
				System.out.printf("%-4d", i);
			}
		}
		
		System.out.println("\n\n");
		//Third way to do a calendar view
		for (int i = 2; i <= 100; i+=2)
		{
			System.out.printf("%-4d", i);
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
		
		
		//use for loops in strings
		String word = "house";
		for(int i = 0; i < word.length(); i++)
		{
			System.out.printf("%-5s", word.substring(i, i + 1));
		}
		System.out.println("\n\n");
		
		
		//scope
		int i = 1;
		for(; i <=5; i++)
		{
			System.out.println(i + "\u2192 Hello");
			
		}
		
		System.out.println(i);
		
		//infinite loop
//		for(;;)
//		{
//			System.out.println("Hello");
//		}
		
		
		
		
		
	}//End of main

}
