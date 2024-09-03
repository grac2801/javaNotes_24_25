package unit_003_if;

import java.util.Scanner;

public class U3_L3_Else
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// if-else
//		System.out.println("Please enter your grade: ");
//		double grade = input.nextDouble();
//
//		if (grade < 60)
//		{
//			System.out.println("That is a failing grade!");
//		} else
//		{
//			System.out.println("This is a passing grade.");
//		}
//
//		
//		//if-else if-else
//		int number = 5;
//		if(number < 5)
//		{
//			System.out.println(number + " < 5");
//		}
//		else if(number > 5)
//		{
//			System.out.println(number + " > 5");
//		}
//		else
//		{
//			System.out.println(number + " == 5");
//		}

		// heart rate
		System.out.println("Enter your heart rate: ");
		int heartRate = input.nextInt();

		if (heartRate <= 60)
		{
			System.out.println("You are an athlete!");
		} else if (heartRate <= 65)
		{
			System.out.println("You are in great health!");
		} else if (heartRate <= 69)
		{
			System.out.println("You are in good health!");
		} else
		{
			System.out.println("You are in poor health");
		}

		/*
		 * STUDENT ACTIVITY: Ask user for the king of pet she/he likes. Then, ask for a
		 * wild animal she/he likes. Compare first letter of both animal strings and
		 * advise on how many letter ahead one is compared to the other one.
		 * 
		 * dog - elephant elephant comes after dog by 1 letter.
		 */

		System.out.println("What kind of pet do you like? ");
		input.nextLine();

		String pet = input.nextLine();
		System.out.println("What kind of wild animal do you want to compare the pet to? ");
		String animal = input.nextLine();

		if (pet.substring(0, 1).compareTo(animal.substring(0, 1)) > 0)
		{
			int difference = pet.substring(0, 1).compareTo(animal.substring(0, 1));
			System.out.println(pet + " comes after " + animal + " by " + difference + " letter(s)");
		} else if (pet.substring(0, 1).compareTo(animal.substring(0, 1)) == 0)
		{
			System.out.println("They start with the same letter.");
		} else
		{
			int difference = animal.substring(0, 1).compareTo(pet.substring(0, 1));
			System.out.println(animal + " comes after " + pet + " by " + difference + " letter(s)");
		}

		input.close();
	}

}
