package unit_005_methods_classes;

import java.util.Scanner;

public class U5_L1_voidMethods
{

	public static void main(String[] args)
	{
		System.out.println("This is my main method");
		doStuff();
		addingNumbers();
	}

	public static void addingNumbers()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		System.out.println("The total is: " + (num1 + num2));
		scan.close();
	}

	public static void doStuff()
	{
		System.out.println("Call from doStuff method");
	}

}
