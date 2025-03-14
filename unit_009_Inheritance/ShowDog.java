package unit_009_Inheritance;

import unit_005_methods_classes.Dog;

public class ShowDog extends Dog
{
	private String owner;
	
	public ShowDog(String breed, int weight, String name, String color, String owner)
	{
		super(breed, weight, name, color);
		this.owner = owner;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public String toString()
	{
		return super.toString() + this.getOwner();
	}
	
	

}
