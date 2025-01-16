package unit_007_ArrayLists;

import java.util.ArrayList;

public class U7_L2_traversingArrayLists
{

	public static void main(String[] args)
	{
		System.out.println("------------ 1.Declare an arrayList ---------------");
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println("birds: " + birds);
		
		System.out.println("\n\n------------ 2.Print via Enhanced for loop ---------------");
		for(String b : birds)
		{
			System.out.println(b);
		}
		
		
		System.out.println("\n\n------------ 3. Traversing an arrayList ---------------");
		for(int i = 0; i < birds.size(); i++)
		{
			System.out.println(birds.get(i));
		}
		
		
		System.out.println("------------ 4. remove Crow---------------");
		for(int i = 0; i < birds.size(); i++)
		{
			if(birds.get(i).equals("Crow"))
			{
				birds.remove(i);
			}
		}
		System.out.println("birds: " + birds);
		
		System.out.println("------------ 5. Better solution ---------------");
		birds.clear();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println("birds: " + birds);
		
		for(int i = birds.size() - 1; i >= 0; i--)
		{
			if(birds.get(i).equals("Crow"))
			{
				birds.remove(i);
			}
		}
		
		System.out.println("birds: " + birds);
		
		
		/*
		 * 6. student activity: Re-populate the arrayList of birds and add a falcon for every 
		 * crow in your arrayList
		 */
		birds.clear();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println("birds: " + birds);
		
		for(int i = 0; i < birds.size(); i++)
		{
			if(birds.get(i).equals("Crow"))
			{
				birds.add("Falcon");
			}
		}
		System.out.println("birds: " + birds);
		
		
		System.out.println("\n\n------------ 7. Duplicate an arrayList ---------------");
		/*
		 * Restart your arrayList and duplicate each value 
		 */
		birds.clear();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println("birds: " + birds);
	
		for(int i = birds.size() - 1; i >= 0; i--)
		{
			birds.add(i + 1, birds.get(i));
		}
		System.out.println("birds: " + birds);
		
		
		
		System.out.println("\n\n------------ 8.Parallel processing ---------------");
		
		birds.clear();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println("birds: " + birds);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jeshua");
		names.add("Selma");
		names.add("Elizabeth");
		names.add("Jack");
		System.out.println("names: " + names);
		
		
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(birds.get(i) + " has the name of " + names.get(i));
		}
		
		
		System.out.println("------------ 9. ArrayList of doubles ---------------");
		ArrayList<Double> myNums = new ArrayList<Double>();
		myNums.add(Double.valueOf(5.5));
		myNums.add(15.8);
		myNums.add(55.8);
		myNums.add(12.6);
		
		for(Double myDoubles : myNums)
		{
			System.out.println("Doubles: " + myDoubles);
			
		}
		
		
		
		System.out.println("\n\n------------ 10. Examine values in ArrayList ---------------");
		/**
		 * ArrayList = [5, 15, 25, 67, 84, 12, 7, 120]
		 * a) print it
		 * b) Add all numbers over 15
		 * c) change any number < 15 to 50, print every value removed
		 * d) change any number equal to 15 to 1000
		 * e) display the total for numbers > 15
		 * f) print final arrayList
		 */ 
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(15);
		myList.add(25);
		myList.add(67);
		myList.add(84);
		myList.add(12);
		myList.add(7);
		myList.add(120);
		
		
		
		
		
		
		
		
		
	}//End of main

}
