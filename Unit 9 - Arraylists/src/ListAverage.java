//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int smallest =ray.get(0);
		int biggest =ray.get(0);
		
		if (ray.size()==1)
			return ray.get(0);
		

		for (int i=1;i<ray.size();i++)
		{
			if (ray.get(i)>biggest)
			{
				biggest = ray.get(i);
			}
			if (ray.get(i)<smallest)
			{
				smallest = ray.get(i);
			}
	
		}
		return (biggest+smallest)/2.0;
				
						
	}
}