package unit_007_ArrayLists;

import java.util.ArrayList;

public class U7_L1_Arraylists
{

	public static void main(String[] args)
	{
		/*
		 * Only holds objects, not primitives.
		 * can add, remove, insert, get, set objects
		 * can change the size of the arrayList since it is
		 * mutable. 
		 * AP Exam --> add, set, get, remove, size, clear
		 */
		
		
		System.out.println("\n1. Declare arrayLists");
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("Eagle");
		birds.add("Crow");
		birds.add("Robin");
		System.out.println(birds);
		
		System.out.println("\n2. Adding items");
		birds.add("Sparrow");
		System.out.println(birds);
		
		
		System.out.println("\n3. set an item");
		String old = birds.set(0, "Falcon");
		System.out.println("The original bird was " + old);
		System.out.println(birds);
		
		
		System.out.println("\n4. length of an arrayList");
		System.out.println("size of the arrayList is " + birds.size());
		
		
		System.out.println("\n5. Remove from arrayList");
		String removed = birds.remove(2);
		System.out.println("Removed bird: " + removed);
		System.out.println(birds);
		
		
		System.out.println("\n6. Does it belong?");
		boolean answer = birds.contains("Sparrow");
		System.out.println("answer: " + answer);
		
		
		System.out.println("\n7. Primitives");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println("list: " + list);
		
		System.out.println("\n8. Primitive to wrapper");
		Integer wrapper = Integer.valueOf(90);
		System.out.println("Integer object value: " + wrapper);
		System.out.println(wrapper.getClass().getCanonicalName());
		
		
		
		
	}

}
