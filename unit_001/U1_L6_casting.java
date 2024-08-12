package unit_001;

public class U1_L6_casting
{

	public static void main(String[] args)
	{
		int e = (int)3.877;
		System.out.println("e : " + e);
		
		//divide an integer in half
		int f1 = 13;
		double half = f1 /2;
		System.out.println("half = " + half);
		
		
		//declare variable as a double
		double f2 = 13;
		half = (f2 / 2);
		System.out.println("half = " + half);
		
		
		//cast as a double
		int f3 = 13;
		half = (double)f3 / 2;
		System.out.println("half = " + half);
		
		//just add a decimal point
		int f4 = 13;
		half = f4 / 2.;
		System.out.println("half = " + half);
		
		//lossy conversion (narrowing)
		double h1 = 13;
		int roundedHalf = (int) (h1 / 2.0);
		System.out.println("roundedHalf = " + roundedHalf);
		
		//rounding
		final double pointFive = 0.5;
		double pos1 = 9.4687565;
		double pos2 = 9.8978;
		double neg1 = -5.987;
		double neg2 = -5.345;
		
		
		System.out.println((int) (pos1 + pointFive));
		System.out.println((int) (pos2 + pointFive));
		System.out.println((int) (neg1 + pointFive));
		System.out.println((int) (neg2 + pointFive));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
