package unit_002;

public class U2_L3_StringMethods
{
	public static void main(String[] args)
	{
		System.out.println("********************");
		System.out.println("Length of my String");
		System.out.println("********************");
		String fruit = "oranges";
		System.out.println("the length of my fruit string is: " + fruit.length() );
		
		
		
		
		
		
		System.out.println("********************");
		System.out.println("Equality of strings");
		System.out.println("********************");
		String name1 = "John";
		String name2 = "John";
		String name3 = new String("John");
		System.out.println("name1 equal to name2 ? " + (name1 == name2));
		System.out.println("name1 equal to name3 ? " + (name1 == name3));
		//Let's use the equals method
		System.out.println("name1 equal to name2 ? " + (name1.equals(name2)));
		System.out.println("name1 equal to name3 ? " + (name1.equals(name3)));
		
		
		
		//OVERLOADED METHODS
		System.out.println("********************");
		System.out.println("substring");
		System.out.println("********************");
		String animal = "Rhinocerous";
		System.out.println("substring 1 - 4: " + animal.substring(1, 4));
		
		System.out.println("animal from index 4 onwards: " + animal.substring(4));
		
		
		System.out.println("********************");
		System.out.println("uppercase and lowercase");
		System.out.println("********************");
		String upper = new String("scream");
		String lower = new String("WHISPER");
		System.out.println(upper);
		System.out.println(lower);
		
		//Let's reverse them
		System.out.println(upper.toUpperCase());
		System.out.println(lower.toLowerCase());
		
		upper = upper.toUpperCase();
		System.out.println(upper.toUpperCase());
		System.out.println(lower.toLowerCase());
		
		System.out.println("********************");
		System.out.println("Compare to");
		System.out.println("********************");
		String herbivore = new String("antelope");
		String pet = new String("dog");
		//Let's compare them
		System.out.println("compare antelope to dog: " + herbivore.compareTo(pet));
		System.out.println("compare dog to antelope: " + pet.compareTo(herbivore));
		System.out.println("compare dog to dog: " + pet.compareTo(pet));
		
		
		System.out.println("********************");
		System.out.println("indexOf");
		System.out.println("********************");
		String striped = new String("Zebra");
		int a = striped.indexOf("e");
		System.out.println("Found it an index : " + a);
		
		String sentence = "Today is a good day to learn JAVA";
		int b = sentence.indexOf("n J");
		System.out.println("Found it an index : " + b);
		//not found
		int c = sentence.indexOf("year");
		System.out.println("Found it an index : " + c);
		
		
		
		
		
		
		
		
		
		
		
	}
}
