//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int counter = 0;
		int actual = numArray.length-1;
		for (int i =0;i<numArray.length-1;i++)
		{
			if ((numArray[i]>numArray[i+1]) && (i!=numArray.length-1))
			{
				counter+=1;
			}
		}
		if (counter == actual)
		{
		return true;
		}
		return false;
	}	
}