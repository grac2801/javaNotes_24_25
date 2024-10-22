package unit_005_methods_classes;

import java.util.Scanner;

import edhesive.shapes.Circle;

public class U5_L4_returnMethods
{

	public static void main(String[] args)
	{
		Circle c = new Circle(3);
		double a = c.getArea();
		System.out.printf("The area is %-5.2f%n%n", a);

		/*
		 * Create a method which when passed two integers, it returns back the largest
		 * one.
		 */

		int larger1 = whichLargerOfTheseTwo_Math(4, 5);
		System.out.println("The largest of the two numbers is " + larger1);

		int larger2 = whichLargerOfTheseTwo_if(4, 5);
		System.out.println("The largest of the two numbers is " + larger2);
		
		int larger3 = whichLargerOfTheseTwo_return(4, 5);
		System.out.println("The largest of the two numbers is " + larger3);
		
		/*
		 * Student activity:
		 * Ask the user for 3 numbers, then average them
		 * and return the result formatted to 2 numbers after the 
		 * decimal point.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number: ");
		double num3 = scan.nextDouble();
		
		System.out.printf("The average is: %-5.2f", average(num1, num2, num3) );
		
		
		
		
		scan.close();

	}//End of main

	private static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;
	}

	private static int whichLargerOfTheseTwo_return(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		return b;
	}

	private static int whichLargerOfTheseTwo_if(int a, int b)
	{
		int largerOne = a;
		if (b > largerOne)
		{
			largerOne = b;
		}
		return largerOne;
	}

	public static int whichLargerOfTheseTwo_Math(int a, int b)
	{
		int largerOne = Math.max(a, b);
		return largerOne;
	}

}
