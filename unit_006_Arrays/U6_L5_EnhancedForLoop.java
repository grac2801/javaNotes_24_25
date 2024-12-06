package unit_006_Arrays;

import java.util.Arrays;

import edhesive.shapes.Circle;

public class U6_L5_EnhancedForLoop
{

	public static void main(String[] args)
	{
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++)
		{
			int selected = (int)(Math.random() * 10) + 1;
			nums[i] = selected;
		}
		
		//print using the Arrays class
		System.out.println("Arrays class: " + Arrays.toString(nums));
		
		//print using the normal for loop
		System.out.print("Normal for loop: ");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		
		
		//Enhanced for loop
		System.out.print("\nEnhanced for loop: ");
		for(int i : nums)
		{
			System.out.print(i + " ");
		}
		
		
		
		//Circles array
		System.out.println("\n\nCircles array");
		Circle[] circles = {new Circle(), new Circle(2), new Circle(3)};	
		for(Circle c : circles)
		{
			System.out.println(c);
		}
		
		
		
		
		
	}//end of main

}
