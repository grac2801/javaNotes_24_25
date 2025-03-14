package unit_009_Inheritance.u9_lesson2;

public class OveridingMethods
{

	public static void main(String[] args)
	{
		Quadrilateral q = new Quadrilateral(3, 7, 6, 7);
		System.out.println("Perimeter: " + q.getPerimeter());
		
		Rectangle r = new Rectangle(2, 3);
		System.out.println("Perimeter: " + r.getPerimeter());
	}

}
