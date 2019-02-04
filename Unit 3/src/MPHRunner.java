//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int dist;
		int hrs;
		int mins;
		for(int i = 1; i<= 4; i++)
		{
		out.print("\nEnter the distance :: ");
		 dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		 hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		 mins = keyboard.nextInt();
		
		MilesPerHour test = new MilesPerHour(dist,hrs,mins);
		test.calcMPH();
		test.print();
		}
		
		
		//add more test cases
		
		
	}
}