//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int less = ray[0];
		
		for (int i =1;i<ray.length;i++)
		{
			
			if (ray[i]<less)
			{
				less= ray[i];
			}
		}
		return less;
	}
}

//[-99,1,2,3,4,5,6,7,8,9,10,12345]