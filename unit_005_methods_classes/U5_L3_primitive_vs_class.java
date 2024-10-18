package unit_005_methods_classes;

import edhesive.shapes.Circle;

public class U5_L3_primitive_vs_class
{

	public static void changeNum(int number)
	{
		System.out.println("first print in the method: " + number);
		number++;
		System.out.println("second print in the method: " + number);
		
	}

	private static void changeCircle(Circle c)
	{
		System.out.println(c);
		c.setRadius(5);
		System.out.println(c);
		
	}

	public static void main(String[] args)
	{
		//Primitives only change inside the method.
		int number = 0;
		System.out.println("First print in main " + number);
		changeNum(number);
		System.out.println("Second print in main " + number);
		
		
		//Objects do change once processed in the method that called them
		Circle c = new Circle();
		System.out.println(c);
		changeCircle(c);
		System.out.println(c);
		
		
	}//end of main

}//end of class
