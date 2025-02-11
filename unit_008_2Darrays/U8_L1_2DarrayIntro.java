package unit_008_2Darrays;

public class U8_L1_2DarrayIntro
{

	public static void main(String[] args)
	{
		// Declare 2D array
		// a) int[][] person = new int[4][5]
		// First value = rows, Second value = cols

		double[][] scores = { { 10.5, 6.2, 3.9, 2.7 }, { 5.3, 8.9, 11.2, 4.6 }, { 6.9, 8.4, 9.1, 3.3 } };
		// Add all values in matrix
		double sum = 0;

		System.out.println("Row major");
		for (int row = 0; row < scores.length; row++)
		{
			for (int col = 0; col < scores[row].length; col++)
			{
				sum += scores[row][col];
			}
			System.out.printf("Total value for row %1d is %-5.2f%n ", row, sum);
			sum = 0;
		}
		
		
		System.out.println("\n\n------------ Using enhanced for loop ---------------");
		for(double[] row : scores)
		{
			for(double col : row)
			{
				System.out.print(col + ", ");
			}
		}
		
		System.out.println("\n\nColumn major");
		for(int col = 0; col < scores[0].length; col++)
		{
			for(int row = 0; row < scores.length; row++)
			{
				System.out.println(scores[row][col] + ", ");
			}
			System.out.println();
		}
		
		
		//STUDENT ACTIVITY
		//Print only the second column
		
		
		
		
		

	}

}
