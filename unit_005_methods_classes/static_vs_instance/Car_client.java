package unit_005_methods_classes.static_vs_instance;

import java.util.Scanner;

public class Car_client
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		boolean proceed = true;
		
		while(proceed)
		{
			System.out.println("Make of the car: ");
			String makeCar = scan.nextLine();
			
			System.out.println("Model of the car: ");
			String modelCar = scan.nextLine();
			
			System.out.println("Year of the car: ");
			int yearCar = scan.nextInt();
			
			System.out.println("Miles per gallon: ");
			int mpgCar = scan.nextInt();
			
			
			Car newCar = new Car(makeCar, modelCar, yearCar, mpgCar);
			System.out.println(newCar);
			
			scan.nextLine();
			
			System.out.println("Another car? ");
			
			
			String answer = scan.nextLine();
			
			if(answer.equalsIgnoreCase("n"))
			{
				proceed = false;
			}
			
					
			
		}
		
		System.out.println("Car total \u2192 " + Car.numCars);
		
		
		
		
		
		
		scan.close();
	}

}
