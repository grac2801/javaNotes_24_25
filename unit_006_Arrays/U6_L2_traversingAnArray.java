package unit_006_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class U6_L2_traversingAnArray
{
	public static void main(String[] args)
	{
		System.out.println("Printing the values of an array using a loop");
		int[] myInts = {4, 6, 23, 41, 82, 23, 10};
		for(int i = 0; i < myInts.length; i++)
		{
			System.out.printf("%-5d", myInts[i]);
		}
		System.out.println();
		
		//User input and search for a value in my array
		Scanner scan = new Scanner(System.in);
		
		double[] list = {1.5, 6.2, 8.3, -4.1, 0.8, -2.8};
		System.out.println("What number are you looking for? ");
		double look = scan.nextDouble();
		
		boolean found = false;
		
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] == look)
			{
				found = true;
				System.out.println("Found it at index " + i);
				break;
			}
			else
			{
				found = false;
			}
		}
		if(found == false)
		{
			System.out.println("Number value not found!");
		}
		
		//Let's count how many times something shows in an array
		int[] values = {1, 2, 3, 2, 4, 6, 3, 2, 5, 8};
		System.out.println("What value are you looking for? ");
		int number = scan.nextInt();
		
		int counter = 0;
		
		for (int i = 0; i < values.length; i++)
		{
			if(values[i] == number)
			{
				counter++;
			}
		}
		System.out.println(number + " was found " + counter + " time(s)");
		
		
		//traverse array and check for odd | even
		int[] nums = {11, 32, 23, 44, 51, 65, 76, 80, 90};
		String[] result = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
				result[i] = "even";
			}
			else
			{
				result[i] = "odd";
			}
		}
		
		for (int i = 0; i < result.length; i++)
		{
//			System.out.printf("%-1d \u2192 %-5s%n", i, result[i]);
			System.out.println(i + "  " + result[i]);
			
		}
		
		
		int[] randomNums = new int[10];
		Random rand = new Random();
		for (int i = 0; i < randomNums.length; i++)
		{
			randomNums[i] = rand.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(randomNums));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}//End of main

}
