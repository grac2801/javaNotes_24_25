package unit_008_2Darrays;

public class U8_L2_AlgorithmsWith2D_Arrays 
{

	public static void randomizeScores(int[][] ts)
	{
		for(int row = 0; row < ts.length; row++)
		{
			for(int col = 0; col < ts[row].length; col++)
			{
				ts[row][col] = (int)(Math.random() * 101);
			}
		}
	}

	public static void print(int[][] ts)
	{
		for(int row = 0; row < ts.length; row++)
		{
			for(int col = 0; col < ts[row].length; col++)
			{
				System.out.printf("%-5d", ts[row][col]);
			}
			System.out.println();
		}
	}

	public static void findAverage(int[][] scores, double[] averages)
	{
		for(int row = 0; row < scores.length; row++)
		{
			double sum = 0;
			for(int col = 0; col < scores[row].length; col++)
			{
				sum += scores[row][col];
			}
			
			averages[row] = sum / scores[row].length;
			
		}
	}

	public static void improve(int[][] scores, Boolean[] improving)
	{
		for(int row = 0; row < scores.length; row++)
		{
			int count = 0;
			for(int col = 1; col < scores[row].length; col++)
			{
				if(scores[row][col  -1] <= scores[row][col])
				{
					count++;
				}
			}
			
			if(count == scores[row].length - 1)
			{
				improving[row] = true;
			}
			else
			{
				improving[row] = false;
			}
			
		}
		
		
	}

	public static void main(String[] args)
	{
		int[][] testScores = new int[10][4];
		
		//populates grid
		randomizeScores(testScores);
		//print it
		print(testScores);
		//get averages for every student
		double[] averages = new double[10];
		findAverage(testScores, averages);
		//Is student improving (grades are increasing)
		Boolean[] improving = new Boolean[10];
		improve(testScores, improving);
		
		for(Boolean value : improving)
		{
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
