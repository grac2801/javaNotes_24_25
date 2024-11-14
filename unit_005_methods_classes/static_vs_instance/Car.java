package unit_005_methods_classes.static_vs_instance;

public class Car
{
	private String make;
	private String model;
	private int year;
	private double mpg;
	
	public static int numCars = 0;

	public Car(String make, String model, int year, double mpg)
	{
		this.make = make;
		this.model = model;
		if(year > 2022)
		{
			this.year = 2022;
		}
		else if(year < 1885)
		{
			this.year = 2000;
		}
		else
		{
			this.year = year;
		}
		
		if(mpg < 0)
		{
			this.mpg = 0;
		}
		else
		{
			this.mpg = mpg;
		}
		
		numCars++;
	}//end of constructor
	
	
	public Car()
	{
		this("None", "None", 0, 0);
	}
	
	public String toString()
	{
		return ("ID: " + numCars + "\n"
				+ "Make: " + this.make + "\n"
				+ "Model: " + this.model + "\n"
				+ "Year: " + this.year + "\n"
				+ "MPG: " + this.mpg + "\n"		
				);
	}
	
	
	public int getNumCars()
	{
		return numCars;
	}
	
	
	
	
	
}
