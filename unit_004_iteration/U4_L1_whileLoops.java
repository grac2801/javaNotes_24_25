package unit_004_iteration;

import java.util.Scanner;

public class U4_L1_whileLoops
{

	public static void main(String[] args)
	{
//		System.out.println("********************");
//		System.out.println("Program 1: Positive numbers");
//		System.out.println("********************");
//		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a positive number: ");
//		int num = scan.nextInt(); //initialize
//		int counter = 1;
//		
//		while(num < 0) //test
//		{
//			System.out.println("You entered an incorrect value. Try again");
//			System.out.println("Enter a positive number: ");
//			num = scan.nextInt();
//			counter++;//move it forward
//		}
//		
//		System.out.println(num + " is a positive number.");
//		System.out.println("It only took you " + counter + " times");
		
		
		
		System.out.println("********************");
		System.out.println("Student activity");
		System.out.println("********************");
		/*
		 * Ask to enter a grade
		 * keep a counter
		 * add the total for all grades input
		 * get average
		 */
		
		double gradesum = 0;
		double grade = 0;
		int gradenum = 0;
		System.out.println("Enter a grade:");
		grade = scan.nextDouble();
		while(grade != -1)
		{
			gradesum += grade;
			gradenum++;
			System.out.println("Enter another grade (-1 to STOP):");
			grade = scan.nextDouble();
		}
		
		System.out.println("Your grade is: " + (gradesum / gradenum) + "%");
		
		
		
		
		scan.close();
		
		
		
		
	}

}
