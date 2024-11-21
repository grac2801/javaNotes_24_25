package unit_006_Arrays.GroupCoding;

public class sum_13
{
	public static void main(String[] args)
	{
		int[] values = {1, 2, 13, 2, 1, 13};
		System.out.println(sum13(values));
	}
	
	public static int sum13(int[] values)
	{
		int sum = 0;
		boolean is13present = false;
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] == 13)
			{
				is13present = true;
			}
			else if(is13present == false)
			{
				sum += values[i];
			}
			else if(is13present == true)
			{
				is13present = false;
			}

		}
		return sum;
	}
}
