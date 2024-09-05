package unit_003_if;

import java.util.Random;
import java.util.Scanner;

public class U3_L3_TernaryOperator
{

	public static void main(String[] args)
	{
		Random rand = new Random();
		int randValue = rand.nextInt(11) + 1;
		System.out.println("Random value " + randValue);
		
		//Ask user for input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your guess: ");
		int myGuess = scan.nextInt();
		
		//Ternary operator
		boolean same = (myGuess == randValue) ? true : false;
		System.out.println("Correct guess? " + same);
	
		
		//Switch statement
		@SuppressWarnings("unused")
		String planet = "Earth";
		System.out.println("Enter your planet's name: ");
		scan.nextLine();
		
		String planetGuess = scan.nextLine();
		
		switch(planetGuess)
		{
		case "Mars":
			System.out.println("You are wrong. This is not your planet.");
			break;
		case "Earth":
			System.out.println("You guessed it correctly.");
			break;
		case "Mercury":
			System.out.println("You are wrong again. This is not your planet.");
			break;
		}
		
		scan.close();
		
	}

}
