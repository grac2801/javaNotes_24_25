package unit_002;

public class U2_L1_Strings
{

	public static void main(String[] args)
	{
		String city1 = "San Diego";
		String city2 = city1;
		System.out.println("city1 \u2192 " + city1 + ". Memory location: " + city1.hashCode());
		System.out.println("city2 \u2192 " + city2 + ". Memory location: " + city2.hashCode());
		
		System.out.println("\n\nchanged city1 to Los Angeles");
		city1 = "Los Angeles";
		System.out.println("city1 \u2192 " + city1 + ". Memory location: " + city1.hashCode());
		System.out.println("city2 \u2192 " + city2 + ". Memory location: " + city2.hashCode());
		
		
		String first = "John";
		String second = "John";
		String third = new String("John");
		
		
		System.out.println(first == second);
		System.out.println(first == third);
		
		
		
		
		
		
		
		
	}

}
