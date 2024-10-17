package unit_005_methods_classes;

import java.util.Scanner;

public class U5_L2_parameters
{

	public static void total(int i, int j)//i and j -> parameters
	{
		System.out.println("The result is \u2192 " + (i + j));
	}
	
	public static void square(double number)
	{
		System.out.printf("The value " + number + " squared: " + Math.pow(number, 2));
	}

	public static void squareScanner(Scanner sc)
	{
		System.out.println("Enter a double value: ");
		double doubleValue = sc.nextDouble();
		System.out.printf("The value %-5.2f squared is %.2f", doubleValue, Math.pow(doubleValue, 2));
		
	}
	public static void compute(Scanner sd)
	{
		System.out.println("Enter the first number \u2192 ");
		double firstNum = sd.nextDouble();
		System.out.println("Enter the second number \u2192 ");
		double secondNum = sd.nextDouble();
		System.out.println("What kind of operation do you want to perform? [+, -, x, /]");
		sd.nextLine();
		String symbol = sd.nextLine();
		System.out.println("symbol: " + symbol);
		double total = 0;
		switch (symbol)
		{
		case "+":
			total = firstNum + secondNum;
			break;
		case "-":
			total = firstNum - secondNum;
			break;
		case "x":
			total = firstNum * secondNum;
			break;
		case "/":
			total = firstNum / secondNum;
			break;
		default:
			System.out.println("You did not enter a correct symbol.");
			break;
		}
		System.out.println("The total is \u2192 " + total);

	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		compute(scan);
//		squareScanner(scan);
//		total(3, 5);//Arguments
//		square(5.5);
		
		/*
		 * create a method called compute. It will take
		 * a scanner object as a parameter. Once in the 
		 * program, you will ask for 2 numbers, and an 
		 * operation to perform [+, -, *, /]
		 * Based on the user input, you will display the 
		 * result of the operation.
		 * If none of the symbols, is used, alert user
		 * she/he did not input correct symbol.
		 */
		
		
		scan.close();
	}
	
	

}
