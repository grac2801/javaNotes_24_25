package unit_006_Arrays.GroupCoding;

import java.util.Arrays;

public class WithoutTen_program
{

	public static void main(String[] args)
	{
		int[] nums = new int[]{1, 10, 8, 5, 10, 1, 2};
		System.out.println(Arrays.toString(nums));
		withoutTen(nums);
		System.out.println(Arrays.toString(nums));
		
	}

	public static int[] withoutTen(int[] nums)
	{
		int i = 0;

		while (i < nums.length && nums[i] != 10)
		{
			i++;
		}

		for (int j = i + 1; j < nums.length; j++)
		{
			if (nums[j] != 10)
			{
				nums[i] = nums[j];
				nums[j] = 10;
				i++;
			}
		} // end of for

		for (; i < nums.length; i++)
		{
			nums[i] = 0;
		}
		return nums;

	}// end of method

}
