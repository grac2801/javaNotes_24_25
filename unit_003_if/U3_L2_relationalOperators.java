package unit_003_if;

import java.util.Scanner;

public class U3_L2_relationalOperators
{
	public static void main(String[] args)
	{
		/*
		 * ==, <, >, <=, >=, != The result is always true or false
		 */
		int x = 5;
		boolean isItFive = x == 5;
		System.out.println("isItFive: " + isItFive);
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your grade: ");
		double grade = input.nextDouble();//scanner ends with a double value --Scanner bug
		
		if(grade < 60)
		{
			System.out.println("It is a failing grade.");
			
		}
		
		/*
		 * Write a program for long distance jump. If >= 8.95 meters, then ask
		 * for the name of the athlete, and her/his height, as well as
		 * nationality. Use printf and display as follows: 
		 * The length of the jump is: 9.99 
		 * The name is James Walker. 
		 * He is 70 inches tall
		 * She/He is from United States
		 */
		
		System.out.println("What is the length of the jump? ");
		double lengthOfJump = input.nextDouble();
		input.nextLine();

		if (lengthOfJump >= 8.95)
		{
			System.out.println("What is the the name of the athlete? ");
			String nameOfAthlete = input.nextLine();
			System.out.println("What is the the nationality of the athlete? ");
			String nationalityAthlete = input.nextLine();
			System.out.printf("The length of the jump is: %.2f%nThe name is %s%nShe/He is from %s", lengthOfJump,
					nameOfAthlete, nationalityAthlete);
		}

		if (lengthOfJump < 8.95)
		{
			System.out.println("Good try. Not quite far enough for a world record");
		}

		
		input.close();
		
	}
}
