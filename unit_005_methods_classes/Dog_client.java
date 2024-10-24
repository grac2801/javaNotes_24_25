package unit_005_methods_classes;

public class Dog_client
{

	public static void main(String[] args)
	{
		Dog d = new Dog("German Shepperd", 30, "Benji", "purple");
		d.getColor();
		d.setColor("green");
		System.out.println(d);
		Dog e = new Dog("Poodle", 50, "Richard", "blue");
		System.out.println(e);
		Dog f = new Dog("German Shepperd", 30, "Benji", "purple");
		System.out.println(f);
		
		System.out.println(d.equals(e));
		System.out.println(d.equals(f));
		
		
		
	}

}
