package unit_002;

import edhesive.shapes.*;


public class U2_L5_constructors
{

	public static void main(String[] args)
	{
		System.out.println("********************");
		System.out.println("Create a default circle");
		System.out.println("********************");
		Circle c = new Circle();
		System.out.println(c.toString());
		
		
		System.out.println("********************");
		System.out.println("Circle with a double parameter");
		System.out.println("********************");
		Circle c2 = new Circle(5.587);
		System.out.println(c2.toString());
		
		System.out.println("********************");
		System.out.println("3 Types of Rectangle constructors");
		System.out.println("********************");
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		//second Rectangle (double parameter)
		Rectangle r2 = new Rectangle(3.0);
		System.out.println(r2.toString());
		//3rd Rectangle (2 double parameters)
		Rectangle r3 = new Rectangle(4.0, 5.0);
		System.out.println(r3.toString());
		//Find the perimeter of Rectangle r3
		System.out.println(r3.getPerimeter());
		
		
		System.out.println("********************");
		System.out.println("Create a polygon");
		System.out.println("********************");
		RegularPolygon rp1 = new RegularPolygon(6, 5);
		System.out.println(rp1);
		
		
	}

}
