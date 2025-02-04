package unit_007_ArrayLists.special_searching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class U7_L4_linearSearch
{

	public static void main(String[] args)
	{
		System.out.println("------------ 1.Linear search ---------------");
		Scanner scan = new Scanner(System.in);
		int[] list1 = new int[10];
		for (int i = 0; i < 9; i++)
		{
			list1[1] = 1;
		}
		list1[9] = 2;
		
		
		System.out.println("Hit enter to search the list: ");
		scan.nextLine();
		
		
		//actual search
		for (int i = 0; i < list1.length; i++)
		{
			if(list1[i] == 2)
			{
				System.out.println("#2 appears in position: " + i);
				
			}
		}
		
		
		//Search linearly in an ArrayLilst
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		
		//populate it
		System.out.println("How many elements to add to your array? ");
		int totalElements = scan.nextInt();
		
		
		for (int i = 0; i < totalElements; i++)
		{
			System.out.println("Enter your element: ");
			Integer num = scan.nextInt();
			myNums.add(num);
		}
		
		//print it
		System.out.println("ArrayList: " + myNums);
		
		
		//Search
		System.out.println("What value are you looking for? ");
		Integer value = scan.nextInt();
		
		for (int i = 0; i < myNums.size(); i++)
		{
			if(myNums.get(i).equals(value))
			{
				System.out.println(value + " is at index: " + i);
				break;
			}
		}
		
		
		
		
		
		
		

		scan.close();
	}

}
