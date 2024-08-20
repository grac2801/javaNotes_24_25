package unit_002;

public class U2_L7_WrapperClasses
{

	public static void main(String[] args)
	{
//		Integer thirty = new Integer("98"); Deprecated
		Integer thirtysixInt = Integer.valueOf(36);
		Integer thirtysixString = Integer.valueOf("36");
		Integer thirtysixSeven = Integer.valueOf("37");
		Integer binary11 = Integer.valueOf("1111", 2);
		System.out.println("1111 in decimal is " + binary11);
		int total = thirtysixInt + thirtysixString;
		System.out.println("total = " + total);
		System.out.println(Integer.sum(thirtysixInt, thirtysixString));
		System.out.println(Integer.max(thirtysixInt, thirtysixSeven));
		
		
		//Access max and min values for the Integer wrapper class.
		System.out.printf("The max value for Integer is: %,d%n", Integer.MAX_VALUE);
		System.out.printf("The min value for Integer is: %,d%n", Integer.MIN_VALUE);
		
		//parsing means from string to digit
		String num1 = "700";
		String num2 = "250";
		//Convert string into integer
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		int myTotal = first + second;
		System.out.println("total = " + myTotal);
		
		
		
		//Double into byte
		Double into_byte = 12.05;
		byte byteValue = into_byte.byteValue();
		System.out.println(byteValue);
		
		//binary string into decimal values
		String seventeen = "10001";
		int seventeen_int = Integer.parseInt(seventeen, 2);
		System.out.println("My value is: " + seventeen_int);
		
		
		//Integer to double
		double returned = Integer.valueOf(85).doubleValue();
		System.out.println("returned " + returned);
		
		//hex value into decimal value
		int decimalValue = Integer.parseInt("A1", 16);
		System.out.println("That value is = " + decimalValue);
		
		
		
		
	}

}
