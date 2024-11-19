package unit_006_Arrays;
import java.util.Arrays;
import edhesive.shapes.Circle;

public class U6_L1_oneDimensionalArray
{

	public static void main(String[] args)
	{
		int[] numbers = {10, 15, -5, 4, 1}; //Declare and initialize
		
		numbers[0] = 89;
		numbers[1]++;
		numbers[2] = numbers[2] + 4;
		numbers[2] += 4;
		System.out.println("numbers: " + numbers);
		
		
		double[] doubleArray = new double[3]; //Declare but not initialize;
		doubleArray[0] = 10.6;
		doubleArray[1] = 20.5;
		doubleArray[2] = 30.9;
		
		double answer = doubleArray[0] + doubleArray[1];
		System.out.println("Answer " + answer);
		
		
		//Array of objects
		Circle[] myCircles = new Circle[2];
		myCircles[0] = new Circle(5.8);
		myCircles[1] = new Circle();
		
		System.out.println(myCircles[0]);
		System.out.println(myCircles[1]);
		
		
		char[] myChars = new char[2];
		myChars[0] = 'a';
		System.out.println(myChars[0]);
		System.out.println(myChars[1]);
		
		
		char[] word = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(word);
		
		String[] words = {"dog", "cat", "bird"};
		System.out.println("words " + words);
		System.out.println("words " + Arrays.toString(words));
		
		String[] copied_words = Arrays.copyOfRange(words, 0, 2);
		System.out.println(Arrays.toString(copied_words));
		
		int[] defaultValues = new int[]{5, 4, 8 , 9, 7};
		Arrays.fill(defaultValues, 100);
		System.out.println(Arrays.toString(defaultValues));
		
		

		
		
		
	}

}
