package unit_001;

import java.util.Scanner;

public class U1_L3_DataTypes
{

	public static void main(String[] args)
	{
		//Special formatting printf
		double myVar = 34343534.98998;
		System.out.printf("Total is $%,.2f%n", myVar);
		
		System.out.println(1 + 2);
		System.out.println("1 + 2");
		System.out.println("Hello" + 5 + 5);
		System.out.println("Hello" + (5 + 5));
		
		int maxInt = Integer.MAX_VALUE;
		System.out.println("the highest range for an int is: " + maxInt);
		
		int minInt = Integer.MIN_VALUE;
		System.out.println("the highest range for an int is: " + minInt);
		
		System.out.println("Enter a double number: ");
		Scanner input = new Scanner(System.in);
		double myAverage = input.nextDouble();
		System.out.println("You said your average is: " + myAverage);
		
		System.out.println("Enter a boolean value: ");
		boolean bool = input.nextBoolean();
		System.out.println("You answer was: " + bool);
		
		//Constant
		final double pi = 3.14;
		System.out.println("pi = " + pi);
		
		//Using floats
		float first = 3.5F;
		
		//Using long
		long second = 4343534343433434L;
		
		//next vs nextLine
		input.nextLine();
		
		
		System.out.println("Enter the capital of Brazil: ");
		String capital = input.nextLine();
		System.out.println("you input " + capital);
		
		
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
