package unit_007_ArrayLists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFile
{

	public static void main(String[] args)
	{

		try
		{
			FileReader file = new FileReader("unit_007_ArrayLists//class_roster.txt");
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			
			while((line = reader.readLine()) != null)
					{
						System.out.println(line);
					}
			reader.close();
		}
		catch (IOException e)
		{
			System.out.println("File is not found!!");
		}
		
		
		
		//Write to a file
		ArrayList<String> goodStudents = new ArrayList<String>();
		goodStudents.add("Jeshua");
		goodStudents.add("Jack");
		goodStudents.add("Andrew");
		try
		{
			BufferedWriter pen = new BufferedWriter(new FileWriter("C:\\Users\\ogracias\\Desktop\\A_good_day.txt"));
			for(String n: goodStudents)
			{
				pen.write(n + "\n");
			}
			pen.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}//End of main

}
