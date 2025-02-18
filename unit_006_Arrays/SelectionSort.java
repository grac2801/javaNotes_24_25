package unit_006_Arrays;

public class SelectionSort
{

	public static void main(String[] args)
	{
		int[] elements = {8, 1, 3, 2, 7, 9, 10, 2, 5, 4};
		
		for(int i = 0; i < elements.length - 1; i++)
		{
			int smallest = i;
			
			for(int j = i + 1; j < elements.length; j++)
			{
				if(elements[j] < elements[smallest])
				{
					smallest = j;
				}
			}//inner
			
			int temp = elements[i];
			elements[i] = elements[smallest];
			elements[smallest] = temp;
			
		}//outer loop
		
		
		for(int nums : elements)
		{
			System.out.print(nums + "  ");
		}
		
	}//main

}
