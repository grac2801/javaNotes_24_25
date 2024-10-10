package unit_004_iteration;

import java.util.Scanner;

public class U4_L5_nestedForLoops
{

	public static void main(String[] args)
	{
		System.out.println("********************");
		System.out.println("\n\nNested for loops");
		System.out.println("********************");
		String word = "JAVA";

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < word.length(); j++)
			{
				System.out.println(word.substring(j, j + 1));
			}
		} // end of for loop
		
		
		
		
		System.out.println("********************");
		System.out.println("\n\nInterchange i and j");
		System.out.println("********************");
		for(int i = 4; i > 0; i--)
		{
			for(int j = i; j < 7; j++)
			{
				System.out.println(j);
			}
			System.out.println();
		}
		
		
		/*
		 * Activity: Create a nested for loop that will output 
		 * each letter of the word "dog" 3 times in a row.
		 * dog = dddoooggg
		 */
		
		word = "dog";
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(word.substring(i, i+1));
			}
		}
		
		
		/*
		 * Student activity: Multiplication table
		 * Ask a user for the number limit for the multiplication table
		 * and display it. (space of 4)
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("What table do you want to print? ");
		int limit = scan.nextInt();
		System.out.printf("    ");

		for(int i = 1; i <= limit; i++)
		{
			System.out.printf("%-4d", i);

		}
		System.out.println();
		System.out.print("____");

		for(int x = 1; x <= limit; x++)
		{
			System.out.print("____");

		}
		System.out.println();

		for(int j = 1; j <= limit; j++)
		{
			System.out.printf("%-4d", j);

			for(int k = 1; k <= limit; k++)
			{
				System.out.printf("%-4d", j * k);
			}
			System.out.println();
		}

		scan.close();
		
		
		
		
		
		
		
		
		
	}// end of main

}
