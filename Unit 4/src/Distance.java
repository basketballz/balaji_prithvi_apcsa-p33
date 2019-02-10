//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;
	

	public Distance()
	{
		setCoordinates(0,0,0,0);
		

	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne,yOne,xTwo,yTwo);
		

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;

	}
	
	

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0, xorigin = 0.0 ,yorigin= 0.0;
		
		String result="";


		distanceA=Math.sqrt((x1-xorigin)*(x1-xorigin)+(y1-yorigin)*(y1-yorigin));
		distanceB=Math.sqrt((x2-xorigin)*(x2-xorigin)+(y2-yorigin)*(y2-yorigin));
		if (distanceA<distanceB)
		{
			result= "A is closer to (0,0).";
		}
		if(distanceA==distanceB)
		{
			result ="Same distance";
		}
		if (distanceA>distanceB)
		{
			result = "B is closer to (0,0)";
		}


		return result;
	}
	
	//public String toString()
	//{
		//return String.format("%.3f", result);
	//}
}