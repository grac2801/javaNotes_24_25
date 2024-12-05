package unit_006_Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


class U6_L4_AlgorithmsWithArrays
{


	public static void main(String[] args)
	{
		//Instantiate my scanner
		Scanner scan = new Scanner(System.in);
		
		//Instantiate an array
		int[] grades = new int[10];
		
		//randomize 10 items with values from 1 - 10 inclusive using the Random class.
		//print it in single line
		
		Random rand = new Random();
		for (int i = 0; i < grades.length; i++)
		{
			grades[i] = (int)rand.nextInt(10) + 1;
		}
		System.out.println("Original: " + Arrays.toString(grades));
		
		/**
		 * #1 Insert a new value and drag values to the right of it forward.
		 */
		//Code here
		System.out.println("What value do you want to insert?");
		int value = scan.nextInt();
		System.out.println("Where do you want to place this value? [1 - 10]");
		int position = scan.nextInt();
		
		
		
		//[5, 7, 8, 3, 5, 7, 9, 3, 2 5]
		
		
		
		for (int i = grades.length - 1; i > position - 1; i--)
		{
			grades[i] = grades[i - 1];
		}
		grades[position - 1] = value;
		System.out.println(Arrays.toString(grades));
		
		//---------------------------------------------------------------------------
		/**
		 * #2 Delete an item input by user starting at 1 by the user, but keep last value intact.
		 */
		System.out.println("\n\nWhich position do you want to delete? ");
		position = scan.nextInt();
		
		for(int i = position - 1; i < grades.length - 1; i++)
		{
			grades[i] = grades[i + 1];
		}
		System.out.println(Arrays.toString(grades));

		//---------------------------------------------------------------------
		
		/**
		 * #3 shift left and move first element to last element position
		 */
		//[5, 7, 2, 4, 3] --> [7, 2, 4, 3, 5]
		int firstElement = grades[0];
		for(int i = 0; i < grades.length -1; i++)
		{
			grades[i] = grades[i + 1];
		}
		grades[grades.length - 1] = firstElement;
		System.out.println("exercise 3: " + Arrays.toString(grades));
		
		//---------------------------------------------------------------------
		
		/**
		 * Shift right and move last element to first element position.
		 */
		//[5, 7, 2, 4, 3] --> [3, 5, 7, 2, 4]
		
		int last = grades[grades.length - 1];
		for (int i = grades.length - 1; i > 0; i--)
		{
			grades[i] = grades[i - 1];
		}
		grades[0] = last;
		System.out.println("exercise 4: " + Arrays.toString(grades));
		
		
		
		
		scan.close();
	}//End of main



}//End of class
