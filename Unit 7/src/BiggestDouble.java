//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
				one=a;
				two=b;
				three=c;
				four=d;
				
			
	}

	public double getBiggest()
	{
		double [] cow = {one,two,three,four,};
		double magmaman = 0.0;
		for (int i=0;i<cow.length-1;i++)
		{
			if (cow[i] == one)
			magmaman = cow[0];
			if (cow[i+1]>magmaman)
			magmaman = cow[i+1];
		}
		return magmaman;
	}

	public String toString()
	{
	   return "biggest = "+ getBiggest();
	}
}