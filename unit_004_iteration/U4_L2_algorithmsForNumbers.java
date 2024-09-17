package unit_004_iteration;

import java.util.Scanner;

public class U4_L2_algorithmsForNumbers
{
	public static void main(String[] args)
	{
		/*
		 * algorithm for evenly divisible
		 */
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the larger integer: ");
//		int large = scan.nextInt();
//		System.out.println("Enter the smaller integer: ");
//		int small = scan.nextInt();
//		
//		
//		if(large % small == 0)
//		{
//			System.out.println(large + " is divisible by " + small);
//		}
//		else
//		{
//			System.out.println(large + " is not divisible by " + small);
//		}
		
		
		/*
		 * Algorithm for removing one digit at a time
		 */
		System.out.println("Enter a very large number: ");
		int number = scan.nextInt();
		//12345
		while(number > 0)
		{
			int digit = number % 10;
			System.out.println(digit);
			number /= 10;
		}
		
		
		/*
		 * sentinel value
		 */
		System.out.println("Enter an integer. -1 to end");
		int num = scan.nextInt();
		int largest = num;
		
		
		while(num != -1)
		{
			if(num > largest)
			{
				largest = num;
			}
			System.out.println("Enter an integer. -1 to end");
			num = scan.nextInt();
		}
		System.out.println("The largest value is " + largest);
		
		
		
		
		
		scan.close();
	}

}
