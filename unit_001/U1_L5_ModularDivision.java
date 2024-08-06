package unit_001;

import java.util.Scanner;

public class U1_L5_ModularDivision
{

	public static void main(String[] args)
	{
		System.out.println(14 % 5);
		
		/*
		 * When to use modulus:
		 * patterns
		 * even or odd
		 * time calculations
		 * money
		 * online encryption
		 */
		
		int x = 14;
//		x = x % 5;
		x %= 5;
		System.out.println("x: " + x);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter a whole number: ");
		int num2 = scan.nextInt();
		System.out.println("Division " + num1 + "/" + num2 + " = " + num1/num2);		
		System.out.println("Remainder " + num1 + "%" + num2 + " = " + num1%num2);		
		
		
		//Odd or even
		System.out.println("0 means even, 1 means odd: " + "num1 is " + num1%2);
		
		//Selecting digits from a value
		int digitSelector = 768_439;
		System.out.println("Select last digit: " + digitSelector % 10 );
		System.out.println("Select last 3 digits: " + digitSelector % 1000 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
