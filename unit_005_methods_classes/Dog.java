package unit_005_methods_classes;

public class Dog
{
	// instance variables or fields
	private String breed;
	private int weight;
	private String name;
	private String color;

	
	//constructor
	public Dog(String breed, int weight, String name, String color)
	{
		this.breed = breed;
		if (weight <= 0)
		{
			this.weight = Math.abs(weight);
		} 
		else
		{
			this.weight = weight;
		}
		this.name = name;
		this.color = color;
	}//end of constructor


	public String getBreed()
	{
		return breed;
	}


	public void setBreed(String breed)
	{
		this.breed = breed;
	}


	public int getWeight()
	{
		return weight;
	}


	public void setWeight(int weight)
	{
		this.weight = weight;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getColor()
	{
		return color;
	}


	public void setColor(String color)
	{
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		String message = "Dog breed; " + this.getBreed() + "\n" +
						 "Weight: " + this.getWeight() + "\n" +
						 "Name: " + this.getName() + "\n" +
						 "Color: " + this.getColor() + "\n";	
		return message;
	}
	
	
	public boolean equals(Dog other)
	{
		if(this.breed.equals(other.getBreed()) && 
		   this.weight == other.getWeight() &&
		   this.name.equals(other.getName()))
		   {
			return true;
		   }
		else
		{
			return false;
		}
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
