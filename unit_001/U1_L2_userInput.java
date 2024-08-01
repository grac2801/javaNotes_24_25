package unit_001;

import java.util.Scanner;

public class U1_L2_userInput
{

	public static void main(String[] args)
	{

		System.out.println("********************");
		System.out.println("Setting up scanner");
		System.out.println("********************");
		Scanner scan = new Scanner(System.in);
		
//		String name;
		
		System.out.println("********************");
		System.out.println("Asking for input");
		System.out.println("********************");
		
		
		System.out.println("What is your name? ");
		String name = scan.nextLine();
		System.out.println("Hello " + name + ". It is nice to meet you");
		
		
		//Ask for the person's age
		System.out.println("What is your age? ");
		int myAge = scan.nextInt();
		System.out.println("So, your name is: " + name + ", and your age is: " + myAge);
		
		
		System.out.println("********************");
		System.out.println("Scanner bug");
		System.out.println("********************");
		scan.nextLine();//Has to move forward 1 space for scanner to work
		String snack = "";
		System.out.println("What is your favorite snack? ");
		snack = scan.nextLine();
		System.out.println("My favorite snack is: " + snack);
		
		
		
		
		/*Code for the age of a pet in years, name of the pet, and #
		of visits to the vet*/
		
		scan.close();
		
		
		
		
		
	}

}
