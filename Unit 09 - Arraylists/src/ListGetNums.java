//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;


public class ListGetNums
{
//method go will return an array
//containing the first 3 numbers
//greater than 11
public static List<Integer> go( List<Integer> ray )
	{
	
	ArrayList<Integer> aplus = new ArrayList<Integer>();
	int i =0;
	for ( int  num  : ray   )
	{
		
	        	if (i<3 && num > 11)
	        	{
	        		i++;
	        		aplus.add(num);
	        	}
	        	
	}

	return aplus;
	}
}
	
