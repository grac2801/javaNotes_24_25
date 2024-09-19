package unit_004_iteration;

public class U4_L4_AlgorithmsForStrings
{

	public static void main(String[] args)
	{
		/*
		 * How many times does the 'e' appear on the word periscope?
		 */
		String word = "Periscope";
		int count = 0;
		
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.substring(i, i + 1).equals("e"))
			{
				count++;
			}
		}
		
		System.out.println("e appears " + count  + " times.");
	}

}
