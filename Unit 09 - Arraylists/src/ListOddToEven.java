//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
			int even =0;
			int odd =0;
			int ecounter =1;
			int ocounter =1;
		
		for (int i=0;i<ray.size();i++)
		{
			if (((ray.get(i)%2) != 0) && (ocounter==1))
			{ 
				odd=i+1;
				ocounter++;
			}
		}	
		
		for (int j=ray.size()-1;j>=0;j--)
		{
			if ((ray.get(j))%2==0 && ecounter ==1)
				{
					even = j+1;
					ecounter++;
				}
					
		}
		if (even==0||odd==0)
			return -1;
		return even-odd;
		
				
	}
			
			
			
			
		
}
			   
		
		
		
	
