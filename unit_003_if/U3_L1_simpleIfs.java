package unit_003_if;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U3_L1_simpleIfs
{

	public static void main(String[] args)
	{
		int x = 7;
		
		if(x == 5)
		{
			System.out.println("x equals 5");
			
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many legs does your pet have? ");
		int legs = input.nextInt();
		
		if(legs == 4)
		{
			System.out.println("It is a dog!!");
			System.out.println("It is a cat!!");
			System.out.println("It is a rat!!");
			
		}
		
		
		System.out.println("Enter a double value: ");
		double num = input.nextDouble();
		
		if(num == 18.25)
		{
			System.out.println("You got it.");
		}
		
		num = 3;
		if(num == 3)
		{
			System.out.println("3");
		}
		System.out.println("2");
		
		
		//Randomizer
		int rand = ThreadLocalRandom.current().nextInt(10) + 1;
		System.out.println("rand value = " + rand);
		//my guess
		System.out.println("Guess a number: ");
		int myGuess = input.nextInt();
		
		//test
		if(rand == myGuess)
		{
			System.out.println("You guessed it correctly.");
		}
		
		/*
		 * Ask the user for his/her academic and scholarship grade average
		 * if both averages are above 85%, then state she/he is the honor roll,
		 * otherwise set the honor roll variable to false.
		 */
		
		boolean honorRoll = false;//flags

		System.out.println("What is your academic grade average: ");
		double academicGrade = input.nextDouble();
		System.out.println("What is your citizenship grade average: ");
		double citizenshipGrade = input.nextDouble();
		//test
		if (academicGrade > 85)
		{
			if (citizenshipGrade > 85)
			{
				System.out.println("Congrats, you are in honor roll.");
				honorRoll = true;
			}

		}
		System.out.println("\n\nFinal decision for honor roll \u2192 " + honorRoll);
		//close scanner
		input.close();
		
		
		
		
	}

}
