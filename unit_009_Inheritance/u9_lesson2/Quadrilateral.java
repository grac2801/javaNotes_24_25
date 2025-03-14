package unit_009_Inheritance.u9_lesson2;

public class Quadrilateral
{

	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	
	
	public Quadrilateral(int side1, int side2, int side3, int side4)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}



	public int getSide1()
	{
		return side1;
	}



	public int getSide2()
	{
		return side2;
	}



	public int getSide3()
	{
		return side3;
	}



	public int getSide4()
	{
		return side4;
	}



	public void setSide1(int side1)
	{
		this.side1 = side1;
	}



	public void setSide2(int side2)
	{
		this.side2 = side2;
	}



	public void setSide3(int side3)
	{
		this.side3 = side3;
	}



	public void setSide4(int side4)
	{
		this.side4 = side4;
	}
	
	public int getPerimeter()
	{
		return getSide1() + getSide2() + getSide3() + getSide4();
	}
	
	
	


}
