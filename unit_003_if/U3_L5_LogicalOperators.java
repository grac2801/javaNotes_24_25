package unit_003_if;

import java.util.Scanner;

public class U3_L5_LogicalOperators
{

	public static void main(String[] args)
	{
		/*
		 * AND = &&
		 * OR = ||
		 * NOT = != 
		 */
		
		int x = 4;
		int y = 9;
		
		//and operator [relational have higher precedence than logical]
		boolean first = (x < 10) && (y > 5);
		System.out.println("first \u2192 " + first);
		
		//or operator
		boolean second = (x < 10) || (y > 10);
		System.out.println("second \u2192 " + second);
		
		//not
		x = 5;
		boolean third = !(x == 5);
		boolean third_alternative = (x != 5);
		System.out.println("third: " + third);
		System.out.println("third_alternative: " + third_alternative);
		
		//from video
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		if(num >= 0 && num <= 100)
		{
			System.out.println("numer is between 0 and 100 inclusive");
		}
		if(num < 0 || num > 100)
		{
			System.out.println("number is not a valid number");
		}
		if(!(num == 75))
		{
			System.out.println("Number is not equal to 75");
		}
		
		
		//Student activity
		/*
		 * input an int and test if it is not between 25 and 75 exclusive.
		 * print: "not between 25 and 75"
		 * Provide 2 solutions, one using the && and another using the ||
		 */
		int n = scan.nextInt();
		if ( !( n>25 && n<75 ) )
		{
			System.out.println("not between 25 and 75");
		}
		if ( n<=25 || n>=75 )
		{
			System.out.println("not between 25 and 75");
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
