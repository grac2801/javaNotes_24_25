package unit_004_iteration;

public class U4_L4_AlgorithmsForStrings_OutOfBounds
{
	public static void main(String[] args)
	{
		/*
		 * How many times does 'ba' appear in my word
		 */
		String word = "baseballplayer64";
		int count = 0;
		for(int i = 0; i < word.length() - 1; i++)
		{
			if(word.substring(i, i + 2).equals("ba"))
			{
				count++;
			}
		}
		System.out.println("ba appears " + count + " times.");
		
		
		
		/*
		 * The word is Hello, your code should reverse the word.
		 */
		String toReverse = "Hello";
		String rev = "";
		for(int i = toReverse.length() - 1; i >= 0; i--)
		{
			rev += toReverse.substring(i, i + 1);
		}
		System.out.println("Reversed = " + rev);
		
		
		String mysteryWord = "dinosaur";

		for (int i = 0; i < mysteryWord.length(); i++)
		{
			int index = (i + mysteryWord.length() / 2) % mysteryWord.length();
			System.out.print(mysteryWord.substring(index, index + 1));
		}
		
		
		
		
	}//End of main

}
