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
		
		/*
		* CIRCLES
		* 1. Instantiate a new circle with a radius of 15.879856565 ft. (air balloon)
		* print it to make sure you have done it correctly
		* get the circumference and the area for this circle. Print them
		* to the hundredth value after the decimal point.
		* The balloon loses some gas, therefore deflating.
		* Now change the radius to 12.45458724 ft and get the circumference
		* and area values again.
		*
		* RECTANGLES
		* instantiate a 1x1 ft and 5x5 ft rectangles. Additionally, a 6x4 rectangle
		* as well.
		* Calculate the area of each and print to the hundredth value after the
		* decimal point.
		* Change the width of the second rectangle to 7.5 ft.
		* How much more area did you gain with this change from the original area
		* value?
		* Change the W and L of the third rectangle to 5x3.
		* Print a statement displaying the area, length, perimeter and width of this
		* new object.
		*
		*
		* POLYGONS
		* Instantiate a triangle with all sides being 5 ft in length.
		* Make it a pentagon with same length of sides. [Shape A]
		*
		*/
		
	}

}
