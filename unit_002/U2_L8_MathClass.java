package unit_002;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U2_L8_MathClass
{

	public static void main(String[] args)
	{
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5.4));
		System.out.println(Math.pow(2, 3));
		System.out.println((int) Math.pow(2, 3));
		System.out.println(Math.sqrt(8.8));
		System.out.printf("$%.2f%n", Math.sqrt(8.8));
		
		
		//Create a scanner
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 2 decimal numbers: ");
//		double n1 = scan.nextDouble();
//		double n2 = scan.nextDouble();
		
//		System.out.println("n1 to the power of n2: " + Math.pow(n1, n2));
		
		//non-Static
		String word = new String("apple");
		System.out.println("The length of word is: " + word.length());
		
		
		//Static means it belongs to the class, and you need to ask permission
		//by calling the class first.
		
		System.out.println(Math.random()); //values between 0 and 1 (1 not included)
		
		//A random integer number between 10 and 15
		int myRandomNumber =(int) (Math.random() * 6) + 10;
		System.out.println(myRandomNumber);
		
		//Get a random number from 1 to 100 included
		System.out.println((int)(Math.random() * 100) + 1);
		
		
		//10 to 34 integers only
		System.out.println((int) (Math.random() * 25) + 10);
		
		
		
		//-10 to 10 integers only
		System.out.println((int) ((Math.random() * 21) + 10));
		
		//All the even integers from 1 - 100
		int evens = ((int)(Math.random() * 50) + 1) * 2;
		System.out.println(evens);
		
		
		
		// all the odd numbers from 1 to 100
		int odds = ((int)(Math.random() * 50) * 2) + 1;
		System.out.println(odds);
		
		//All numbers 1 -100 divisible by 5
		int divisibleBy5 = (int)(Math.random() * 20 + 1) * 5;
		System.out.println("divisible by 5: " + divisibleBy5);
		
		//All numbers 0-25 multiples of 3
		int divisibleBy3 = (int)(Math.random() * 8 + 1) * 3;
		System.out.println("divisible by 5: " + divisibleBy3);
		
		
		System.out.println("********************");
		System.out.println("#2 class Random");
		System.out.println("********************");
		Random rand = new Random();
		int myRandomValue = rand.nextInt(10) + 1;
		System.out.println("The Random value is: " + myRandomValue);
		
		System.out.println("********************");
		System.out.println("#3 ThreadLocalRandom class");
		System.out.println("********************");
		//Select a random day in a month of 31 days
		int day = ThreadLocalRandom.current().nextInt(31) + 1;
		System.out.println("The day of the month is: " + day);
		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
