package unit_002;

public class U2_L2_EscapeSequences_StringConcatenation
{

	public static void main(String[] args)
	{
		System.out.println("\"Everybody should learn to program "
				+ "a computer, \nbecause it teaches you how to think.\""
				+ "\n-Steve Jobs, former CEO and creator of Apple. "
				+ "\n\tTesting for a tab escape key");
		System.out.println("The path is: C:\\Users\\647465\\Desktop");
		
		//Strings and calculations
		int x = 2;
		int y = 4;
		System.out.println("The sum is: "  + x + y);
		System.out.println("The sum is: "  + (x + y));
		
		
		//Unicode
		System.out.println("Your name  \u2192 Mr. Gracias");
		System.out.println("The amount due is \u20AC675.98");
		
		
		
		
		
		
	}

}
