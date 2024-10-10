package unit_004_iteration;

public class U4_L5_Pyramids
{

	public static void main(String[] args)
	{
		System.out.println("\n\n");
		System.out.println("-----Triangle 1-----");

		for(int i = 1; i <= 5; i++)
		{

		for(int j = 1; j <= i; j++)
		{
		System.out.printf("%-4d", j);
		}
		System.out.println();
		} // End of outer loop

		System.out.printf("%n");
		System.out.println("-----Triangle 2-----");

		for(int i = 0; i < 5; i++)
		{

		for(int j = 1; j <= (5 - i); j++)
		{
		System.out.printf("%d ", j);
		}
		System.out.printf("%n");
		}

		System.out.printf("%n");
		System.out.println("-----Triangle 2 optional-----");

		for(int i = 1; i <= 5; i++)
		{

		for(int j = 1; j <= (5 - i + 1); j++)
		{
		System.out.printf("%d ", j);
		}
		System.out.printf("%n");
		}

		System.out.printf("%n");
		System.out.println("-----Triangle 3 -----");

		for(int i = 1; i <= 5; i++)
		{

		for(int whitespace = i; whitespace < 5; whitespace++)
		{
		System.out.printf(" ");
		}

		for(int j = 1; j <= i; j++)
		{
		System.out.printf("%d ", j);
		}
		System.out.println();
		}

		System.out.printf("%n");
		System.out.println("-----Triangle 3 Optional-----");

		for(int row = 1; row <= 5; row++)
		{

		for(int whitespace = 1; whitespace <= (5 - row); whitespace++)
		{
		System.out.print(" ");
		}

		for(int num = 1; num <= row; num++)
		{
		System.out.printf("%d ", num);
		}
		System.out.println();
		}

		System.out.printf("%n");
		System.out.println("-----Triangle 4-----");

		for(int row = 1; row <= 5; row++)
		{

		for(int whitespace = 1; whitespace < row; whitespace++)
		{
		System.out.print(" ");
		}

		for(int num = 1; num <= (5 - row + 1); num++)
		{
		System.out.printf("%d ", num);
		}
		System.out.println();
		}

		System.out.printf("%n");
		System.out.println("-----Triangle 4 optional-----");

		for(int row = 0; row < 5; row++)
		{

		for(int whitespace = 0; whitespace < row; whitespace++)
		{
		System.out.print(" ");
		}

		for(int num = 1; num <= (5 - row); num++)
		{
		System.out.printf("%d ", num);
		}
		System.out.println();
		}
	}

}
