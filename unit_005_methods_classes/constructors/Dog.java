package unit_005_methods_classes.constructors;

public class Dog
{
	// instance variables
	private String breed;
	private int weight;
	private String name;
	private String color;

//	public Dog(String breed, int weight, String name, String color)
//	{
//		this.breed = breed;
//		this.weight = weight;
//		this.name = name;
//		this.color = color;
//	}

	public Dog(String breed, int weight, String name, String color)
	{
		setBreed(breed);
		setWeight(weight);
		setName(name);
		setColor(color);
	}

	public Dog()
	{
		this("Unknown", 30, "Unknown", "black");
	}

	// getters and setters
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

	public Dog(String breed, String name)
	{
		this.breed = breed;
		this.name = name;
		this.weight = 0;
		this.color = "unknown";
	}

	@Override
	public String toString()
	{
		return "Breed of dog: " + this.getBreed() + "\n" + 
	           "Weight of dog: " + this.getWeight() + "\n" + 
				"Name of dog: " + this.getName() + "\n" + 
				"Color of the dog: " + this.getColor() + "\n\n";
	}
	
	
	public void printObject() 
	{
		System.out.println(this);
	}

}
