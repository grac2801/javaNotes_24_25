package unit_007_ArrayLists;

import java.util.ArrayList;

public class U7_L3_ArrayList_Algorithms
{

	public static void main(String[] args)
	{
		System.out.println("------------ 1.Instantiate an ArrayList and populate ---------------");
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Purple");
		colors.add("Baby pink");
		System.out.println(colors);
		
		
		System.out.println("\n\n------------ 2.Search for colors starting with B ---------------");
		for(String i: colors)
		{
			if(i.startsWith("B"))
			{
				System.out.printf("%s %n",  i);
			}
		}
		
		System.out.println("\n\n------------ Student activity= Same search using substring ------------");
		for(String i : colors)
		{

			if (i.substring(0, 1).equals("B"))
			{
				System.out.printf("%s %n", i);
			}
		}

		
		
		System.out.println("\n\n+++++ STUDENT ACTIVITY +++++");
		System.out.println("Print color strings longer than 5");
		for(String s : colors)
		{

			if (s.length() > 5)
			{
				System.out.printf("%s%n", s);

			}
		}
		
		
		
		System.out.println("\n\n+++++ 3.Reverse the order of the Strings in the list +++++");
		for(int i = 0; i < colors.size(); i++)
		{
			String col = colors.remove(i);
			colors.add(0, col);

		}
		System.out.println("colors after: " + colors);

		
	}//End of main

}//End of class
