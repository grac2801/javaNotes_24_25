package unit_006_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class U6_L3_ArraysOfStrings
{

	public static void main(String[] args)
	{
		/*
		 * Instantiate a new int array, call it numbers
		 * randomize 25 integers between 1 - 100 inclusive
		 * print it out using the for loop
		 */
		int[] numbers = new int[25];
		Random rand = new Random();
		for(int i = 0; i < 25; i++)
		{
			numbers[i] = (int)(rand.nextInt(100) + 1);
		}
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print((i + 1) + ": " + numbers[i] + "\n");
			
		}
		
		
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "my";
		words[2] = "friend";
		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]);
			
		}
		
		
		/*
		 * Ask for a number of superheroes to enter
		 * then instantiate a new array called superhero
		 * Ask the user to populate the array one superhero at a time
		 * then print the contents of the array.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("How many superheroes do your want to enter: ");
		int total = scan.nextInt();
		scan.nextLine();// must be added since different type next

		String[] superhero = new String[total];

		for (int i = 0; i < superhero.length; i++)
		{
			System.out.println("Enter a superhero: ");
			superhero[i] = scan.nextLine();
		}

		
		//capitalize the output and tell me how many characters long
		// the superhero's name is.
		for(int i = 0; i < superhero.length; i++)
		{
			System.out.println(superhero[i].toUpperCase() + " is "
					+ superhero[i].length() + " characters long.");
		}
		
		
		/*
		 * print the superheroes but only the first and last letters 
		 * of each
		 */
		for (int i = 0; i < superhero.length; i++)
		{
			int x = superhero[i].length();
			String y = superhero[i].substring(0, 1);
			String z = superhero[i].substring(x - 1, x);
			System.out.println(y + z);
			
		}

		scan.close();
	}//end of main

}//end of class
