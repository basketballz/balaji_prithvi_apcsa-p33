//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		LeapYear cow = new LeapYear();
		
		for (int i=1; i<=4;i++)
		{
			out.print("Enter a year : :");
			int year= keyboard.nextInt();
		
		if (cow.isLeapYear(year) == true)
			out.println(year+" "+" is a leap year");
		else
			out.println(year+" "+" is not a leap year");
			
		}
	}
}