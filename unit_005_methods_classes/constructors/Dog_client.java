package unit_005_methods_classes.constructors;

public class Dog_client
{

	public static void main(String[] args)
	{
		Dog d = new Dog("Poodle", 120, "Daisy", "Chocolate");
		System.out.println(d);
		
		//default
		Dog pup1 = new Dog();
		System.out.println(pup1);
		
		System.out.println();
		d.printObject();
		System.out.println("\n\n");
		pup1.printObject();
		
		
		
		
	}

}
