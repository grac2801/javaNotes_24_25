package unit_001;

import java.util.Scanner;

public class U1_L4_NumberCalculations
{

	public static void main(String[] args)
	{

		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double num1 = scan.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = scan.nextDouble();

		double answer = num1 / num2;
		System.out.println("When divided, the result is: " + answer);

		
		//Adding values
		int myNum = 0;
//		myNum = myNum + 1;
		myNum++;//postfix
		++myNum; //prefix
		//add 5 to it
		myNum += 5;
		myNum -= 3;
		myNum *= 3;
		System.out.println(myNum);
		
		
		scan.close();
	}

}
