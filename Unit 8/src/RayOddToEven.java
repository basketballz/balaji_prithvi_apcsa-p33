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
				
				for (int j=i;j<ray.length;j++)
				{
					if ((ray[j]%2)==0)
					{
						return distance;
					}
					distance+=1;
				}
				
			}
			
			
			
			
		
		}
			   
		
		return -1;
		
	}
}
