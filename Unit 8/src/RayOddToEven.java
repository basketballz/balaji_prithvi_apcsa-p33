//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int distance=0;
		
		for (int i=0;i<ray.length;i++)
		{
			if ((ray[i]%2) != 0)
			{ 
				i++;
				for (int j=i;j<ray.length;j++)
				{
					if ((ray[i]%2)!=0)
					{
						distance++;
					}
				}
			}
		
		}
			   
		
		if (distance == 0)
		{
			distance= -1;
			
		}
		return distance;
		
	}
}
