package unit_003_if;

import edhesive.shapes.Circle;
import edhesive.shapes.Rectangle;

public class U3_L7_ComparingObjects
{

	public static void main(String[] args)
	{
		String word1 = new String("Hello");
		String word2 = new String("Hello");
		
		if(word1.equals(word2))
		{
			System.out.println("Those 2 objects are the same");
		}
		
		//Geometric objects
		Circle c1 = new Circle(2.5);
		Circle c2 = new Circle(2.5);
		if(c1.equals(c2))
		{
			System.out.println("Those 2 objects are the same again");
		}
		
		
		//Now we can use the == and != for objects
		//to check whether they are the same object
		
		word1 = "Hello";
		word2 = word1;
		String word3 = new String("Hello");
		
		if(word1 == word2)
		{
			System.out.println("These 2 objects are the same. word1 and word2");
		}
		if(word1.equals(word3))
		{
			System.out.println("these 2 objects are the same. word1 and word3");
			
		}
		
		//rectangles
		System.out.println("Rectangles");
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = r1;
		Rectangle r3 = new Rectangle(3, 4);
		
		if(!(r1 == r2))
		{
			System.out.println("r1 and r2 are not the same object");
		}
		if(!(r1.equals(r2)))
		{
			System.out.println("r1 and r2 don't have the same value");
		}
		if(!(r1 == r3))
		{
			System.out.println("r1 and r3 are not the same object");
		}
		if(!(r1.equals(r3)))
		{
			System.out.println("r1 and r3 don't have the same value");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
