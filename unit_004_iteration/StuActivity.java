package unit_004_iteration;

import java.util.Scanner;

public class StuActivity
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner scan = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS)
		{
			// 1. Generate two random single digits
			int number1 = (int) (Math.random() * 10) + 1;
			System.out.println(number1);
			int number2 = (int) (Math.random() * 10) + 1;
			System.out.println(number2);

//			int answer = 0;
			// 2. If second number is greater than first
			if (number1 < number2)
			{
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			// 3. Prompt user for inputting an answer
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = scan.nextInt();

			// 4. Grade answer and display result
			if (number1 - number2 == answer)
			{
				System.out.println("You are correct!!");
				output += "\n" + number1 + " - " + number2 + " = " + answer
						+ ((number1 - number2 == answer) ? " correct" : " wrong");
				correctCount++;
				count++;
			}
			else
			{
				System.out
						.println("You answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));

				// Increase question count
				count++;

				output += "\n" + number1 + " - " + number2 + " = " + answer
						+ ((number1 - number2 == answer) ? " correct" : " wrong");
			} // End of else

		} // End of while loop

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Correct count is " + correctCount);
		System.out.println("Total time: " + totalTime / 1_000 + " seconds.");
		System.out.println(output);

		scan.close();
	}
}
