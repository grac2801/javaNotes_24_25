package unit_005_methods_classes.constructors;

public class Die
{
	private int value;
	private int numSides;
	
	
	public Die(int numSides)
	{
		this.numSides = numSides;
		rollDice();
	}
	
	
	public Die()
	{
		this(6);
	}
	
	public void rollDice()
	{
		this.value = (int)(Math.random() * numSides) + 1;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getNumSides()
	{
		return numSides;
	}

	public void setNumSides(int numSides)
	{
		this.numSides = numSides;
	}
	
	public String toString()
	{
		return "The value is: " + this.getValue();
	}
}
